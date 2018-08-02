package cn.mvc.day05MutiActionController;



import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController extends MultiActionController {

    public String doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "index";
    }
    public String doSecond(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "index";
    }

}
