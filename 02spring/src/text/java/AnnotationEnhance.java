
import cn.wh.myaspect.IBook;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationEnhance {
    @Test
    public void firstAnnotation(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("myaspect.xml");
        IBook book=  (IBook)appletContext.getBean("advisor");
        System.out.println("前置增强-------------------------------------");
        book.selectbook();
        System.out.println("后置增强--------------------------------------");
        book.updatebook();
        System.out.println("环绕增强--------------------------------------");
        book.insert();
        System.out.println("异常增强-----------------------------------------");
        book.delete();
        System.out.println("最终增强5------------------------------------------");
        book.Final();
    }
}
