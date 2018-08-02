package cn.wh.myaspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;

public class PointCut {
    @Pointcut(value = "execution(* *..myaspect.*.selectbook(..))")
    public  void selectbook(){
        System.out.println("S");
    }
    @Pointcut(value = "execution(* *..myaspect.*.updatebook(..))")
    public  void updatebook(){

    }
        @AfterReturning("selectbook()updatebook()")
    public void after(){
    System.out.println("after");
}
}
