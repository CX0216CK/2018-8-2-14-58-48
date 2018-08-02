package cn.mvc.day14typecontroller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class FirstController {
    @ExceptionHandler
    public ModelAndView sb(Exception ex, HttpServletRequest request){
            ModelAndView mv=new ModelAndView();
            mv.addObject("uname",request.getParameter("uname"));
            mv.setViewName("login");
            return mv;
    }
    /*注解定义访问此方法路径*/
    @RequestMapping("/dologin")
    public String dologin(String uname, int age, Date birthday) {
        System.out.println(uname);
        System.out.println(age);
        System.out.println(birthday);
        return "successsuccess";
    }
}
