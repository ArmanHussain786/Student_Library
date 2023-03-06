package com.example.Student_library_management.Service;

import com.example.Student_library_management.Enums.CardStatus;
import com.example.Student_library_management.Models.Card;
import com.example.Student_library_management.Models.Student;
import com.example.Student_library_management.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student)
    {


        //
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentvariable(student);


        //let's go to the student
        student.setCard(card);

        //Cascading effect will save the card as well
        studentRepository.save(student);



        return "Student and Card added successfully";
    }
}
