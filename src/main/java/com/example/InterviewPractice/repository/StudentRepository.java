package com.example.InterviewPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InterviewPractice.entiry.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
