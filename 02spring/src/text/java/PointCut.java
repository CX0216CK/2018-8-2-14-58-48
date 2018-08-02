import cn.wh.myaspect.IBook;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointCut {
    @Test
    public  void  FirstPointCut(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("myaspect.xml");
        IBook book=  (IBook)appletContext.getBean("advisor");
        book.selectbook();
    }
}
