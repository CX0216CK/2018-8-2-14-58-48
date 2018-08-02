package springaffair;

import cn.affair.entity.StockException;
import cn.affair.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfairTest {
    @Test
    public  void  firstAfair(){
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbctemplateaffair.xml");
        IAccountService service = (IAccountService) context.getBean("txadvicew");
        boolean b = false;
        try {
            b = service.updateAccoint(1, 1, 1, 1);
        } catch (StockException e) {
            e.printStackTrace();
        }
        System.out.println(b);
    }
}
