import cn.wh.dao.IUser;
import cn.wh.dao.IUserDao;
import cn.wh.dao.IUserType;
import cn.wh.entity.User;
import cn.wh.entity.UserType;
import cn.wh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test20180704 {
    //加了一个这个就不行啦
    //查询单一条 有条件 (1对1)
    @Test
 public  void  userTypeList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserType mapper = sqlSession.getMapper(IUserType.class);
        UserType userType = mapper.listType();
        System.out.println(userType.getUsers().size());
    }
    //查询单一条 有条件 (一对多)
    @Test
    public  void  userTypeListcondition(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserType mapper = sqlSession.getMapper(IUserType.class);
        UserType userType = mapper.UserTypecondition(1);
        List<User> users = userType.getUsers();
        System.out.println(users);
        for (User item:users
             ) {
            System.out.println(item.getUpwd());
        }
}
    //多对一
   @Test
    public  void manyTOne(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUser mapper = sqlSession.getMapper(IUser.class);
        User user = mapper.findeUser(2);

        System.out.println(user.getUname()+"=");
    }
    //多对多
    @Test
    public  void manyTomany(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUser mapper = sqlSession.getMapper(IUser.class);
        User user = mapper.findempmany(1);
        System.out.println(user.getUserType().getUid());
    }
}
