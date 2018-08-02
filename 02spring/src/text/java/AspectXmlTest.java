import cn.wh.AspectXml.IBook;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectXmlTest {
    @Test
    public void  FirstAspect(){
        ApplicationContext appletContext = new ClassPathXmlApplicationContext("AspectXml.xml");
        IBook fIrstspring = (IBook) appletContext.getBean("book");
        fIrstspring.delete();
        fIrstspring.selectbook();
    }
}
