package cn.wh.cagent;


import cn.wh.agent.IStudent;
import cn.wh.agent.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        final IStudent iStudent=new Student() ;
        //第一个参数是类加载器 getClass().getClassLoader()
        //第二个参数是接口加载器 getClass().getInterfaces()
        //InvocationHandler invocationHandler
         IStudent student=(IStudent)Proxy.newProxyInstance(iStudent.getClass().getClassLoader(),iStudent.getClass().getInterfaces(), new InvocationHandler() {
             @Override
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 System.out.println("befource====");
                 method.invoke(iStudent,args);
                         return null;
             }
         });
         student.findAll();
    }
}
