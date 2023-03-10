package com.example.Student_library_management.Controllers;

import com.example.Student_library_management.Models.Student;
import com.example.Student_library_management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public String createStudent(@RequestBody Student student)
    {
       return studentService.createStudent(student);
    }
}
