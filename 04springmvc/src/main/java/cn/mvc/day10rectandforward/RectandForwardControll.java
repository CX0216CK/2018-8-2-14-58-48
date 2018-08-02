package cn.mvc.day10rectandforward;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RectandForwardControll {
    //转发到页面
    @RequestMapping("/dofirst")
    public String doFirst(Model model) {
        model.addAttribute("msage", "考试");
        return "redirect:/day10/success.jsp";
    }
    //转发到处理器页面
    @RequestMapping("/dosecond")
    public String doFirst() {
        return "success";
    }
    //转发到处理器方法
    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("msage", "考试");
        return "forward:dosecond";
    }
    @RequestMapping("/doseconds")
    public String dosecond() {
        return "success";
    }
    //重定向到处理器方法
    @RequestMapping("/adds")
    public String redirectadd(Model model) {
        model.addAttribute("msage", "考试");
        return "redirect:doseconds";
    }
}
