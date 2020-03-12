package com.yao.service;

import com.yao.pojo.Books;

import java.util.List;

/**
 * @author shkstart
 * @date 2020/3/5 0005 - 下午 6:55
 */
public interface BookService {
    int addBook(Books book);

    int delBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
