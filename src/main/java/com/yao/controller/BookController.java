package com.yao.controller;

import com.yao.pojo.Books;
import com.yao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 2020/3/5 0005 - 下午 9:42
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }
    @RequestMapping("/addBookPage")
    public String toAddPage(){
        return "addBookPage";
    }
@RequestMapping("/addBook")
    public String toAddBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/updatepage")
    public String toupdatepage(int bookID,Model model){
        Books book = bookService.queryBookById(bookID);
        model.addAttribute("book",book);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String toupdateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/deleteBook")
    public String todeleteepBook(int bookID){
        bookService.delBookById(bookID);
        return "redirect:/book/allBook";
    }
@RequestMapping("/queryBookByName")
    public String toQueryBookByName(String bookName,Model model){
        Books book = bookService.queryBookByName(bookName);
        if(book == null){
            model.addAttribute("error","你查询的书籍不存在");
        }else{
            List<Books> books = new ArrayList<Books>();
            books.add(book);
            model.addAttribute("list",books);
        }

        return "allBook";

    }
}
