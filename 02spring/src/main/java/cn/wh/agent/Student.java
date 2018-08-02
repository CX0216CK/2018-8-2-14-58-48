package cn.wh.agent;

public class Student implements IStudent {
    @Override
    public void findAll() {
        int num=5/0;
        System.out.println("findAll");
    }
}
