package cn.wh.aopfirst.dao;

public class HelloDaoImpl implements IHello {
    @Override
    public void dosome() {
        System.out.println("数据成功写入DB");
    }
}
