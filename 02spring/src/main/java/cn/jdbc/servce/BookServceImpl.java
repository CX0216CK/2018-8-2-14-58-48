package cn.jdbc.servce;

import cn.jdbc.dao.IBookDao;
import cn.jdbc.entity.Book;

import java.util.List;

public class BookServceImpl implements IBookServce
{
    public IBookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(IBookDao bookDao) {
        this.bookDao = bookDao;
    }

    private IBookDao bookDao;
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
