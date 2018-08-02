import cn.wh.aopfirst.server.HelloServer;
import cn.wh.aopfirst.server.IhelloServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aop {
    @Test
    public void First(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("aop.xml");
        IhelloServer fIrstspring =(IhelloServer) appletContext.getBean("service");
        fIrstspring.dosome();
    }
}
