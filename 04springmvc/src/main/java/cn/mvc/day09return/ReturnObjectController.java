package cn.mvc.day09return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReturnObjectController {
    //返回时数值型
    @RequestMapping("/dofirst")
    @ResponseBody
    public Object dofirst(){
    return 1;
    }
    //返回时字符串型
    @RequestMapping(value = "/dosecond",produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object dosecond(){
        return "我";
    }
    // 返回是 对象的类型
    @RequestMapping(value = "/dothird")
    @ResponseBody
    public Object dothird(){
        UserInfo userInfo=new UserInfo();
        userInfo.setName("呵呵");
        userInfo.setPwd("123");
        return userInfo;
    }
    //返回集合类型
    @RequestMapping(value = "/dofouth")
    @ResponseBody
    public List dofouth(){
        UserInfo userInfo=new UserInfo();
        userInfo.setName("呵呵");
        userInfo.setPwd("123");
        List<UserInfo> list=new ArrayList<UserInfo>();
        list.add(userInfo);
        return list;
    }
    //返回双列map集合类型
    @RequestMapping(value = "/dofive")
    @ResponseBody
    public Map dofive(){
        UserInfo userInfo=new UserInfo();
        userInfo.setName("呵呵");
        userInfo.setPwd("123");
     Map<String,UserInfo> map=new HashMap<String, UserInfo>();
     map.put(userInfo.getName(),userInfo);
     return map;

    }
}
