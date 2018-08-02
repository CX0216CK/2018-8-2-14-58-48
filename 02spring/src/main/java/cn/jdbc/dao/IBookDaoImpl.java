package cn.jdbc.dao;

import cn.jdbc.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class IBookDaoImpl extends JdbcDaoSupport implements IBookDao {
    @Override
    public List<Book> findAll() {
       String sql="select * from Book";
        List<Book> lists = this.getJdbcTemplate().query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book=new Book();
                book.setBookAuthor(resultSet.getString("bookAuthor"));
                book.setBookName(resultSet.getString("bookName"));
                book.setBookPrice(resultSet.getDouble("bookPrice"));
                book.setId(resultSet.getInt("bookID"));
                return book;
            }
        });
        return lists;
    }
}
