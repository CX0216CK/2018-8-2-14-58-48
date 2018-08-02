package cn.mvc.day12selfexcetion;


import cn.mvc.day12selfexcetion.exections.AgeExcetion;
import cn.mvc.day12selfexcetion.exections.UserNameExcetion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 标识
 */
@Controller
public class ExcetionHeight {
    @RequestMapping("/dofirst")
    public String doForest(String uname,int age) throws UserNameExcetion, AgeExcetion {
            if (!"admin".equals(uname)){
                throw  new UserNameExcetion("用户名不合法");
            }
            if (age>60){
                throw  new AgeExcetion("年龄不合法");
            }
        return "successsuccess";
    }
}
