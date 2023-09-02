package Library.Management.System.LibrarymanagementSystem.Controller;

import Library.Management.System.LibrarymanagementSystem.Service.impl.BookService;

import Library.Management.System.LibrarymanagementSystem.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/add")
    public String addBook(@RequestBody Book book)throws Exception{
        return bookService.addBooks(book);
    }

}
