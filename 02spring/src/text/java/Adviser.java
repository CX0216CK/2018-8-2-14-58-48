
import cn.wh.adviser.IStudent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Adviser {
    @Test
    public void  adviserFirst(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("adviser.xml");
        IStudent fIrstspring =(IStudent) appletContext.getBean("prox");
      fIrstspring.findAll();
    }
}
