package cn.wh.agent;

import org.springframework.aop.ThrowsAdvice;

public class Abnormal implements ThrowsAdvice {
    public void  afterThrowing (Exception ex){
        System.out.println("异常的增强");
    }
}
