package cn.mvc.day10rectandforward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExectionController {
    @RequestMapping("/doexcetion")
    public String doForest(){
        int num=10/0;
        return "/day11/successsuccess";
    }
}

