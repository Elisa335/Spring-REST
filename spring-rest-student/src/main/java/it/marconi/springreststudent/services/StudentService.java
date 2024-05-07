package it.marconi.springreststudent.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.springreststudent.domains.Student;
import it.marconi.springreststudent.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepo;

    //resituisco uno studente come debug
    public Student save(Student s){
        return studentRepo.save(s); 
    }


}
