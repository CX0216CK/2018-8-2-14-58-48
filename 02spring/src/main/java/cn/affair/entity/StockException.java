package cn.affair.entity;

public class StockException extends ClassNotFoundException   {
    public StockException() {
    }

    public StockException(String s) {
        super(s);
    }
}
