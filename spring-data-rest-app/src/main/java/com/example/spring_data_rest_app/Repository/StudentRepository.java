package com.example.spring_data_rest_app.Repository;

import com.example.spring_data_rest_app.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
