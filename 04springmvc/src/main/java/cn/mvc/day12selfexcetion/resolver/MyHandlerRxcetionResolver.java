package cn.mvc.day12selfexcetion.resolver;

import cn.mvc.day12selfexcetion.exections.AgeExcetion;
import cn.mvc.day12selfexcetion.exections.UserNameExcetion;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerRxcetionResolver implements HandlerExceptionResolver {
    //resolve 解析        Excetion 异常
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",e);
        System.out.println(e);
        if (e instanceof AgeExcetion){
            mv.setViewName("ageerror");
        }
        if (e instanceof UserNameExcetion){
            mv.setViewName("nameerror");
        }
        return mv;
    }
}
