package com.yao.service;

import com.yao.mapper.BookMapper;
import com.yao.pojo.Books;

import java.util.List;

/**
 * @author shkstart
 * @date 2020/3/5 0005 - 下午 6:57
 */
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int delBookById(int id) {
        return bookMapper.delBookById(id);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
    public Books queryBookByName(String bookName){
        return bookMapper.queryBookByName(bookName);
    }
}
