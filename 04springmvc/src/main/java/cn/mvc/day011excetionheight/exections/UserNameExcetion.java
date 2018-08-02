package cn.mvc.day011excetionheight.exections;

public class UserNameExcetion extends  Exception {
    public UserNameExcetion() {
        super();
    }

    public UserNameExcetion(String message) {
        super(message);
    }
}
