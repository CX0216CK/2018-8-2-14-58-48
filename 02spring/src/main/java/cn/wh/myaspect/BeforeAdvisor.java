package cn.wh.myaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
@Aspect
public class BeforeAdvisor {
    //   前置增强
    @Before("execution(* *..myaspect.*.selectbook(..))")
    public void Before(JoinPoint joinPoint) {
        System.out.println("前置注解" + joinPoint);
    }

    //后置增强
    @After("execution(* *..myaspect.*.updatebook(..))")
    public void After() {
        System.out.println("后注解");
    }

    //环绕增强
    @Around("execution(* *..myaspect.*.insert(..))")
    public void surround(ProceedingJoinPoint pjp) {
        System.out.println("Before");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("After");
    }

    //异常增强
    @AfterThrowing(value = "execution(* *..myaspect.*.delete(..))", throwing = "error")
    public void abnormal(Exception error) {
        System.out.println("异常出现了" + error.getMessage());
    }

    //最终增强
    @After(value = "execution(* *..myaspect.*.Final(..))")
    public void Final() {
        System.out.println("最终增强");
    }


    @Pointcut(value = "execution(* *..myaspect.*.selectbook(..))")
    public void selectbook() {
        System.out.println("S");
    }

    @Pointcut(value = "execution(* *..myaspect.*.updatebook(..))")
    public void updatebook() {

    }

    @AfterReturning("selectbook()updatebook()")
    public void after() {
        System.out.println("after");
    }
}