package cn.mvc.day07viewresolver;



import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController extends MultiActionController {
    //内部视图对象引用
    public String doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "jstlViewObject";
    }
    //外部视图对象引用
    public String doSecond(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "OutViewObject";
    }
}
