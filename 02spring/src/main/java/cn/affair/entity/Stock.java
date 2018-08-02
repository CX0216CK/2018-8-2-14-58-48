package cn.affair.entity;

public class Stock {
    private Integer sid;
    private String sname;
    private int scout;

    public Stock() {
    }

    public Integer getSid() {

        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getScout() {
        return scout;
    }

    public void setScout(int scout) {
        this.scout = scout;
    }

    public Stock(Integer sid, String sname, int scout) {
        this.sid = sid;
        this.sname = sname;
        this.scout = scout;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scout=" + scout +
                '}';
    }
}
