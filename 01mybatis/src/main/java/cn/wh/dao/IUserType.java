package cn.wh.dao;

import cn.wh.entity.User;
import cn.wh.entity.UserType;

import java.util.List;

public interface IUserType {
    //用户和用户类型 (1对1)
    public UserType  listType();
    //用户和用户的类型多条查询(1 对 多)
    public  UserType  UserTypecondition(int typeid);

}
