package cn.mvc.day13annotationexection.exections;

public class AgeExcetion extends  Exception {
    public AgeExcetion() {
        super();
    }

    public AgeExcetion(String message) {
        super(message);
    }
}
