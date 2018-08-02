package cn.affair.service;

import cn.affair.dao.IAccountDao;
import cn.affair.dao.IStockDao;
import cn.affair.entity.StockException;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements IAccountService {
    IAccountDao accountdao;
    IStockDao stockdao;


    @Transactional()
    @Override
    public boolean updateAccoint(Integer aid, int blance, int sid, int count) throws StockException {
        boolean flag=false;
        boolean account=true;
        boolean accountflag = accountdao.updateAccoint(aid, blance, account);
        if(true){
            throw new StockException("网络被挂掉异常");
        }
        boolean stockflag =stockdao.updateStock(sid,count,account);
        if (accountflag&stockflag){
            flag=true;
        }
        return flag;
    }
    public IAccountDao getAccountdao() {
        return accountdao;
    }

    public void setAccountdao(IAccountDao accountdao) {
        this.accountdao = accountdao;
    }

    public IStockDao getStockdao() {
        return stockdao;
    }

    public void setStockdao(IStockDao stockdao) {
        this.stockdao = stockdao;
    }
}
