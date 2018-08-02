package cn.wh.AspectXml;

import cn.wh.automaticagent.Idosomething;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Asperct {
public void before(){
    System.out.println("before");
}
public void after(){
    System.out.println("after");
}
}
