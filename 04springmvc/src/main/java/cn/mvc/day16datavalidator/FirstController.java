package cn.mvc.day16datavalidator;

import cn.mvc.day16datavalidator.domain.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class FirstController {
    @RequestMapping("/re")
    public String re(@Valid UserInfo info, BindingResult result, Model model){
        System.out.println(info.getUname());
        System.out.println(result.getErrorCount()+"===========");
        if (result.getErrorCount()>0){
            FieldError userName = result.getFieldError("uname");
            System.out.println(userName);
            FieldError age= result.getFieldError("age");
            FieldError userPhone= result.getFieldError("userPhone");
            FieldError email=result.getFieldError("userEmail");
            if (userName!=null){
                String message=userName.getDefaultMessage();
                model.addAttribute("uname",message);
                System.out.println(message+"pp");
            }
            if (age!=null){
                String message=age.getDefaultMessage();
                model.addAttribute("age",message);
            }
            if (userPhone!=null){
                String message=userPhone.getDefaultMessage();
                model.addAttribute("userPhone",message);
            }
            if (email!=null){
                String message=email.getDefaultMessage();
                model.addAttribute("userEmail",message);
            }

            return "login";
        }
        return  "successsuccess";
    }
}
