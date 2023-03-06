package com.example.Student_library_management.Repositories;

import com.example.Student_library_management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
