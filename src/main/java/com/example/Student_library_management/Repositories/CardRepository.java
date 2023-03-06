package com.example.Student_library_management.Repositories;

import com.example.Student_library_management.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
