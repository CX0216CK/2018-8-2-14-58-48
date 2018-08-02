package cn.mvc.day15initbinder;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class FirstController {
    @InitBinder("birthday")
    /**
     * 如果注解括号中不填写指定的参数名称 则 这个默认和每个参数做比较
     *  如果指定了则只会和匹配的参数进行 对比
     */
    public void initbinder(WebDataBinder binder){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
    }
    /*注解定义访问此方法路径*/
    @RequestMapping("/dologin")
    public String dologin(String uname, int age, Date birthday) {
        System.out.println(uname);
        System.out.println(birthday);
        System.out.println(age);
        return "successsuccess";
    }
}
