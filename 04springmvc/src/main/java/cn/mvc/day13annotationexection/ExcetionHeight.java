package cn.mvc.day13annotationexection;




import cn.mvc.day13annotationexection.exections.AgeExcetion;
import cn.mvc.day13annotationexection.exections.UserNameExcetion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 标识
 */
@Controller
public class ExcetionHeight {
    @ExceptionHandler({UserNameExcetion.class,AgeExcetion.class})
    public ModelAndView exectionHandle( Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",e);

        if (e instanceof AgeExcetion){
            mv.setViewName("ageerror");
        }
        if (e instanceof UserNameExcetion){
            mv.setViewName("nameerror");
        }
        return mv;
    }
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
