import cn.wh.dao.IUserDao;
import cn.wh.entity.User;
import cn.wh.util.MybatisUtil;
import org.junit.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test20180626 {
    @Test//查询
    public  void  selectAll(){
    String path="mybatis-config.xml";
    SqlSession sqlSession=null;

    try {
        InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
        SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory= sqlSessionFactoryl.build(is);
        sqlSession=factory.openSession();

        List<User> list= sqlSession.selectList("findAll");
        for (User item:list
             ) {

            System.out.println(item.getUname());
        }
        System.out.println("ssss");
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        sqlSession.close();
    }
}
    @Test //新增
    public void  insert(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;
        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            User user1=new User();
            user1.setUname("第三次");
            user1.setPhone("13207530832");
            user1.setUpwd("22");

            int insert= sqlSession.insert("addUser",user1);

            sqlSession.commit();
            if (insert>0){
            System.out.println("success");
            }else {
                System.out.println("error");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test //删除
    public  void  delete(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;
        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            int delete= sqlSession.delete("deleteUser",24);
            sqlSession.commit();
            if (delete>0){
                System.out.println("deletesuccess");
            }else {
                System.out.println("deleteerror");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test //修改
    public  void  update(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;
        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            User user=new User();
            user.setUname("第二次");
                user.setUid(25);
            int delete= sqlSession.delete("updateUser",user);
            sqlSession.commit();
            if (delete>0){
                System.out.println("updatesuccess");
            }else {
                System.out.println("updateerror");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test //查询单个
    public void   firstUser(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;
        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            User user= sqlSession.selectOne("SelectUser");
            System.out.println(user.getPhone() );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
   @Test  //注解的方式修改参数
    public  void  upadteParm(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;
        User user=new User();
        user.setUname("第二次");
        user.setUid(25);
        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            IUserDao mapper = sqlSession.getMapper(IUserDao.class);
            User user1 = mapper.SelectUser();
            System.out.println(user1.getPhone());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test //第一个模糊查询
    public  void  firstSearch(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;

        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            IUserDao mapper = sqlSession.getMapper(IUserDao.class);
            List<User> list = mapper.searchList("1");
            for (User item:list
                 ) {
                System.out.println(item.getUname());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test   //模糊查询(二)
    public  void  secondSearch(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;

        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            IUserDao mapper = sqlSession.getMapper(IUserDao.class);
            List<User> list = mapper.searchSecondList("1");
            for (User item:list
                    ) {
                System.out.println(item.getUname());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
    @Test   //添加后返回ID
    public  void  ReturnId(){
        String path="mybatis-config.xml";
        SqlSession sqlSession=null;

        try {
            InputStream is= org.apache.ibatis.io.Resources.getResourceAsStream(path);
            SqlSessionFactoryBuilder sqlSessionFactoryl=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory= sqlSessionFactoryl.build(is);
            sqlSession=factory.openSession();
            IUserDao mapper = sqlSession.getMapper(IUserDao.class);
            User user1=new User();
            user1.setUname("返回ID");
            user1.setPhone("13207530832");
            user1.setUpwd("22");
          mapper.insertReturnId(user1);
            sqlSession.commit();
            System.out.println(user1.getUid());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
    @Test //使用工具类 MybatisUtil
    public void  MybatisUtil(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        User user= sqlSession.selectOne("SelectUser");
        System.out.println(user.getUname()+"=");
    }
    @Test //使用集合的第一次查询(多条件)
    public  void  FirstList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        Map<String ,Object> map=new HashMap<String ,Object>() ;
        //Key千万一定要和实体类对应
        map.put("uname","1");
        map.put("upwd","1");
        List<User> users = mapper.conditionFirst(map);
        System.out.println(users.size());
    }
    @Test //使用索引的查询(多条件)
    public void  indexList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> conditionindex = mapper.conditionindex("1", "1");
        System.out.println(conditionindex.size()+"index");
    }
    @Test //智能标签 where if
    public  void  condition(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user=new User();
        user.setUname("1");
        user.setUpwd("1");
        List<User> condition = mapper.condition(user);
        System.out.println(condition.size());
    }
    @Test //智能标签 forearch 数组
    public  void  conditionByforearch(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        int [] bookid={1,2};
        List<User> condition = mapper.conditionByforearch(bookid);
        for (User item:condition
             ) {
            System.out.println(item.getUname());
        }
    }
    @Test //智能标签 forearch 集合
    public  void  conditionByforearchList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
     List<Integer> list=new ArrayList<>();
            list.add(1);
        List<User> condition = mapper.conditionByforearchList(list);
        for (User item:condition
                ) {
            System.out.println(item.getUname());
        }
    }
    @Test //智能标签 forearch 集合自定义
    public  void  SecondconditionByforearchList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> list=new ArrayList<User>();
        User user=new User();
        user.setUid(1);
        list.add(user);
        User user1=new User();
        user1.setUid(2);
        list.add(user1);
        List<User> condition = mapper.conditionByforearchListSecond(list);
        for (User item:condition
             ) {
            System.out.println(item.getUname());
        }

    }
}
