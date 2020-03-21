package com.tang.controller;

import com.tang.pojo.Books;
import com.tang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GodLike
 * @create 2020-03-20-10:37
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPager() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdate")
    public String toUpdatePager(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
       bookService.deleteBookById(id);
        return "redirect:/book/allBook";

    }
    @RequestMapping("/queryBookNamePage")
    public String queryBookByName(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null){
           list = bookService.queryAllBook();
           model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
