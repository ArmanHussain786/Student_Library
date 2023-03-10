package com.example.Student_library_management.Service;

import com.example.Student_library_management.Models.Author;
import com.example.Student_library_management.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(Author author)
    {
        authorRepository.save(author);
        return "Author added successfully";
    }
}
