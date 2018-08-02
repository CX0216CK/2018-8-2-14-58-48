import cn.wh.data01.Collection;
import cn.wh.data01.FIrstSpring;
import cn.wh.data01.Structure;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Test20180705 {
    @Test
    public  void  FirstSpring(){
         ApplicationContext appletContext=new ClassPathXmlApplicationContext("applicationContext.xml");
         FIrstSpring fIrstspring =(FIrstSpring) appletContext.getBean("fIrstspring");

        System.out.println(fIrstspring.getSecondSpring().getSex());
    }
    @Test
    //构造的方法
    public  void  structuer(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("constructure.xml");
        Structure fIrstspring =(Structure) appletContext.getBean("structure");
        System.out.println(fIrstspring.getUname());
    }
    @Test
    //P
    public  void  pstructuer(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("constructure.xml");
        Structure fIrstspring =(Structure) appletContext.getBean("stu");
        System.out.println(fIrstspring.getUname());
    }
    //数组
    @Test
    public void manyArray(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("constructure.xml");
        Collection fIrstspring =(Collection) appletContext.getBean("Collection");
        System.out.println(fIrstspring);

    }

}
