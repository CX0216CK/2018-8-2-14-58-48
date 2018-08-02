import cn.wh.aopfirst.server.IhelloServer;

import cn.wh.automaticagent.IBook;
import cn.wh.automaticagent.Idosomething;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Automaticagent {
    //一个类
    @Test
    public void Oneautoma() {
        ApplicationContext appletContext = new ClassPathXmlApplicationContext("automaticagent.xml");
        Idosomething fIrstspring = (Idosomething) appletContext.getBean("iDoSomeThing");
        IBook book = (IBook) appletContext.getBean("book");
        fIrstspring.select();


    }
}