package com.spring.security.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    Student addStudent(Student student){
      return studentRepository.save(student);
    }

    List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
