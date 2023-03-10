package com.example.Student_library_management.Service;

import com.example.Student_library_management.Models.Author;
import com.example.Student_library_management.Models.Book;
import com.example.Student_library_management.Repositories.AuthorRepository;
import com.example.Student_library_management.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book)
    {
        //i want to get the authorEntity??
        int authorId = book.getAuthor().getId();


        //Now i will be fetching the author entity


        Author author = authorRepository.findById(authorId).get();

        //Basic attribute are already set from the postman
        //setting the foreign key attributes in the child class


        book.setAuthor(author);

        //we need to update the listofBooks written in the parent class

        List<Book> currrentBooksWritten = author.getBooksWritten();
        currrentBooksWritten.add(book);

        //why do we need to save(update) the author again
        //bcoz author entity has been updated we need to resolve it again
        authorRepository.save(author);
        //save function act as both update and save
        //bookRepo is not require bcoz it will autocalled by cascading effect

        return "Book added successfully";

    }

}
