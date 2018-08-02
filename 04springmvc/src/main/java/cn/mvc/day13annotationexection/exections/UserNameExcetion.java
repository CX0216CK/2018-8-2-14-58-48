package cn.mvc.day13annotationexection.exections;

public class UserNameExcetion extends  Exception {
    public UserNameExcetion() {
        super();
    }

    public UserNameExcetion(String message) {
        super(message);
    }
}
