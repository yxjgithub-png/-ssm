package com.yao.mapper;
import com.yao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @date 2020/3/5 0005 - 下午 5:50
 */
public interface BookMapper {
    int addBook(Books book);

    int delBookById(@Param("bookID") int id);

    int updateBook(Books book);

    Books queryBookById(@Param("bookID") int id);

    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
