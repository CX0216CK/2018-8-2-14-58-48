package cn.affair.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public boolean updateAccoint(Integer aid, int blance, boolean isbuy) {
        boolean flag=false;
        //isbuy等于true 证明是买入
        String sql="";
        if (isbuy){
            sql="update account SET ablance=ablance+? where aid=?";
        }else {
            sql="update account SET ablance=ablance-? where aid=?";
        }
   ;
        int update = this.getJdbcTemplate().update(sql, blance, aid);
        if (update>0){
            flag=true;
        }
        return flag;
    }
}
