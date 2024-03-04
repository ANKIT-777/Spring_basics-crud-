package com.example.Resttesting.controller;

import com.example.Resttesting.model.Student;
import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class apiCallingforStudents {

    Student student = new Student();

    @GetMapping("{roll}")
    public Student getStudentByrol(Integer roll){
        return student;
    }

    @PostMapping
    public String postStudent(@RequestBody Student student ){
        this.student = student;
        return "success";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        this.student = student;
        return "updated";
    }

    @DeleteMapping("{roll}")
    public String deleteStudent(String roll){
        this.student = null;
        return "Deleted";
    }
}
