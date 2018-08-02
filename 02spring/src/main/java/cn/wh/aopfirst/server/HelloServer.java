package cn.wh.aopfirst.server;

import cn.wh.aopfirst.dao.IHello;

public class HelloServer implements IhelloServer {
    //植入DAO
    IHello hello;

    public IHello getHello() {
        return hello;
    }

    public void setHello(IHello hello) {
        this.hello = hello;
    }

    @Override
    public void dosome() {
        hello.dosome();
    }
}
