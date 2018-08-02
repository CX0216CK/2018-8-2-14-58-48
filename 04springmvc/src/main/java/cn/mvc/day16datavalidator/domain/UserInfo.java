package cn.mvc.day16datavalidator.domain;


import javax.validation.constraints.*;
import java.util.Date;

/***
 * 用户实体
 * 验证 用户的用户名
 * 验证用户的 年龄
 * 验证用户的  出生日期
 */
public class UserInfo {
    @NotNull(message = "用户名不能为空")
    @Size(min = 6, max = 20, message = "用户名的长度必须在 {min} 到{max}之间")
    private String uname;
    @NotNull(message = "年龄不能为空")
    @Max(value = 150, message = "150岁")
    @Min(value = 0, message = "最小0岁")
    private Integer age;
    @NotNull(message = "用户手机号不能为空")
    @Pattern(regexp = "^1[3|5|7|8|9]\\d{9}$",message = "手机号码格式不正确")
    private String userPhone;
    @NotNull(message = "用户邮箱不能为空")
    @Pattern(regexp = "^\\w+@\\w+\\.\\w+$",message = "邮箱格式不正确")
    private String userEmail;
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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
