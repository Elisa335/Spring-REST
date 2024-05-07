package it.marconi.springreststudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.marconi.springreststudent.domains.Student;
import it.marconi.springreststudent.services.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //post perché è per aggiungere
    @PostMapping("/addstudent")
    //deve prenderlo dal body della richiesta http
    public Student addStudent(@RequestBody Student s){

        return studentService.save(s);
    }

    /**
    @GetMapping
    public Student getsStudent(){
        return Student getsStudent();
    }
    */
    
}
