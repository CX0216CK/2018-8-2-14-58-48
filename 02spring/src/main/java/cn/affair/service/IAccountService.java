package cn.affair.service;

import cn.affair.entity.StockException;

public interface IAccountService {
    //public  boolean updateAccoint(Integer aid,int blance,boolean isbuy);
        //购买股票
    public  boolean updateAccoint(Integer aid,int blance,int sid,int count) throws StockException;
}
