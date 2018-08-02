package cn.wh.dao;

import cn.wh.entity.User;


public interface IUser {
  //一对多
  public User findeUser(Integer typeid);
  //多对多
  public User findempmany(Integer empNo);
}
