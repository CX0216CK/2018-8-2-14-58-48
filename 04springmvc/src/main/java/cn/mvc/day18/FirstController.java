package cn.mvc.day18;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController  {
    @RequestMapping("/dofirst")
    @ResponseBody
    public String dofirst(){
        System.out.println("dofirst");
        return "fileupload";
    }

}
