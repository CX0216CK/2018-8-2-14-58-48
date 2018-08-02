package cn.mvc.day12selfexcetion.exections;

public class AgeExcetion extends  Exception {
    public AgeExcetion() {
        super();
    }

    public AgeExcetion(String message) {
        super(message);
    }
}
