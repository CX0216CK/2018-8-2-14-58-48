package cn.mvc.day08controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/**
 * 标识
 */
    @RequestMapping("/Identification")
public class FirstController {
    /*注解定义访问此方法路径*/
    @RequestMapping("/doindex")
    public String doIndex() throws Exception {
        return "index";
    }
    /*注解定义访问此方法路径*/
    //   * 通配的是0 到 多个
    //   /**/ 可以有 0 到N 级 目录
    //   /*/ 有一个目录
    @RequestMapping("/*second")
    public String dosecond() throws Exception {
        return "second";
    }
    /*注解定义访问此方法路径*/
    @RequestMapping(value = "/third",method = RequestMethod.POST)
    public String third() throws Exception {
        return "third";
    }
}
