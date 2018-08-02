package cn.wh.dao;

import cn.wh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    //查询所有
    public List<User> findAll();
    //添加
    public  int addUser(User user);
    //删除
    public  int deleteUser(int id);
    //修改
    public  int updateUser(User user);
    //查询单个
    public User SelectUser();
    //模糊查询
    public List<User> searchList(String condition);
    //模糊查询(二)
    public List<User> searchSecondList(String condition);
    //添加后返回ID
    public int insertReturnId(User user);
    //第一种多条件查询(map)
    public List<User> conditionFirst(Map<String ,Object> map);
    //第一种多条件查询(index)
    public List<User> conditionindex(String uname,String upwd);
    //智能标签 if+where
    public List<User> condition(User user);
    //智能标签forearch Array
    public  List<User> conditionByforearch(int [] array);
    //智能标签forearch List
    public  List<User> conditionByforearchList(List<Integer> list);
    //智能标签forearch List自定义list
    public  List<User> conditionByforearchListSecond(List<User> list);
}
