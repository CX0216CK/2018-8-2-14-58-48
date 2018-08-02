package cn.affair.entity;

public class Account {
    private Integer aid;
    private String  aname;
    private String ablance;

    public Account(Integer aid, String aname, String ablance) {
        this.aid = aid;
        this.aname = aname;
        this.ablance = ablance;
    }
    public Account() {
    }
    public Integer getAid() {

        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAblance() {
        return ablance;
    }

    public void setAblance(String ablance) {
        this.ablance = ablance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", ablance='" + ablance + '\'' +
                '}';
    }
}
