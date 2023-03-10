package com.example.Student_library_management.Controllers;

import com.example.Student_library_management.Models.Author;
import com.example.Student_library_management.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author)
    {
         return authorService.createAuthor(author);

    }
}
