package com.spring.security.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

     @GetMapping
    List<Student> getAllStudent(){
      return  studentService.getAllStudent();
    }

    @PostMapping
    ResponseEntity<Student> studentAdded(@RequestBody Student student){
       return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.OK);
    }

}
