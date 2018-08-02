package cn.wh.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
public class MybatisUtil {
        static String path="mybatis-config.xml";
        static InputStream is;
        static SqlSessionFactory factory;
    static {
        try {
            is = org.apache.ibatis.io.Resources.getResourceAsStream(path);
            factory=new  SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        return factory.openSession();
    }
}
