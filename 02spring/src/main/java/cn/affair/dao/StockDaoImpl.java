package cn.affair.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    @Override
    public boolean updateStock(int sid, int count,boolean isbuy) {
        boolean flag=false;
        String sql="";
        //买入
        if (isbuy){
            sql="UPDATE stock SET scout=scout+? WHERE sid=?";
        }else{
            sql="UPDATE stock SET scout=scout-? WHERE sid=?";
        }
        int update = this.getJdbcTemplate().update(sql, count, sid);
        if (update>0){
            flag=true;
        }
        return flag;
}
}
