package cn.mvc.day011excetionheight.exections;

public class AgeExcetion extends  Exception {
    public AgeExcetion() {
        super();
    }

    public AgeExcetion(String message) {
        super(message);
    }
}
