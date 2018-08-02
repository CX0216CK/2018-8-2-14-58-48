package jdbctemplate;

import cn.jdbc.entity.Book;
import cn.jdbc.servce.BookServceImpl;
import cn.wh.annotation.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class springjdbc {
    @Test
    public  void  springJdbc(){
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("jdbctemplate.xml");
        BookServceImpl fIrstspring =(BookServceImpl) appletContext.getBean("bookservce");
        List<Book> all = fIrstspring.findAll();
        for (Book item:all) {
            System.out.println(item.getBookName());
        }
    }
}
