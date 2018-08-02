package cn.wh.agent;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Surround implements MethodInterceptor
{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before======");
        methodInvocation.proceed();
        System.out.println("after========");
        return null;
    }
}
