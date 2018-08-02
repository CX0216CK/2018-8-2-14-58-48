package cn.wh.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

import javax.annotation.Resource;

@Component("stu")
public class Student {
    /*
        JAVA JDK  里面有javax包
     */
    @Value("呵呵") //普通属性
    private String uname;
    @Value("18") //普通属性
    private Integer age;
    //域属性
    //@Resource(name = "car") //JDK 提供
    //第二种方式
    @Autowired()
    @Qualifier(value = "car")
    private Car car;

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
