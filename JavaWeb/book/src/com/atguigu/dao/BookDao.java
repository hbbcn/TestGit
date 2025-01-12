package com.atguigu.dao;

import com.atguigu.pojo.Book;

import java.util.List;

public interface BookDao {

    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    public Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int begin, int pageSize);

    public List<Book> queryForPagePrice(int min, int max,int begin,int pageSize);

    public Integer queryPriceTotalCount(int min,int max);

//    public Book queryBookByName(String bookName);


}
