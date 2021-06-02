package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    // Inject studentRepository
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
    // get list student
        return studentRepository.findAll();
    }
}
