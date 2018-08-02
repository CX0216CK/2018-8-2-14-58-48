package cn.mvc.day12selfexcetion.exections;

public class UserNameExcetion extends  Exception {
    public UserNameExcetion() {
        super();
    }

    public UserNameExcetion(String message) {
        super(message);
    }
}
