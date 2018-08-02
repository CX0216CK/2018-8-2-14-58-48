import cn.wh.automatic.Student;
import cn.wh.data01.Collection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test20180707 {
    @Test
    public void manyArray(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("automatic.xml");
        Student student =(Student) appletContext.getBean("stu");

        System.out.println(student.getCar().getColor());
    }

}
