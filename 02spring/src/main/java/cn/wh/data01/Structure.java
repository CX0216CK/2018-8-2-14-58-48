package cn.wh.data01;

public class Structure {
    private String uname;
    private Integer age;
    public Structure(){

    }

    public Structure(String uname, Integer age) {
        this.uname = uname;
        this.age = age;
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
