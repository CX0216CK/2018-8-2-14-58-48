import cn.wh.annotation.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotation {
    @Test
    public  void  FirstSpring(){
         ApplicationContext appletContext=new ClassPathXmlApplicationContext("annotation.xml");
        Student fIrstspring =(Student) appletContext.getBean("stu");

        System.out.println(fIrstspring.getCar().getColor());
    }

}
