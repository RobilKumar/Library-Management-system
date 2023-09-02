package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.Repository.AuthorRepository;
import Library.Management.System.LibrarymanagementSystem.Repository.BookRepository;
import Library.Management.System.LibrarymanagementSystem.entity.Author;
import Library.Management.System.LibrarymanagementSystem.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

@Autowired
    AuthorRepository authorRepository;

    @Override
    public String addBooks(Book book) throws Exception {
     Author author;

     try{
         author= authorRepository.findById(book.getAuthor().getId()).get();
     }
     catch (Exception e){
         throw new Exception ("author is not present");
     }

        author.getBooks().add(book);
        book.setAuthor(author);

        // due to using cascase.typeall here crud operation  will be on both child and parent class
        authorRepository.save(author);
        return "Book added successfully";
    }
}
