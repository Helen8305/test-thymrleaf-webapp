package com.example.testthymrleafwebapp.dao;

import com.example.testthymrleafwebapp.entety.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
