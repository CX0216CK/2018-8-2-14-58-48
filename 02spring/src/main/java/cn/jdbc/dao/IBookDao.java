package cn.jdbc.dao;

import cn.jdbc.entity.Book;

import java.util.List;

public interface IBookDao {
    public List<Book> findAll();
}
