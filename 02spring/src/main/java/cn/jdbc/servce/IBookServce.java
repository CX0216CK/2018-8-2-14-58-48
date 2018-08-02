package cn.jdbc.servce;

import cn.jdbc.entity.Book;

import java.util.List;

public interface IBookServce {
    public List<Book> findAll();
}
