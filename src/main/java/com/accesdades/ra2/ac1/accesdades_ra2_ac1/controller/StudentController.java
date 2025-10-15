package com.accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;
import com.accesdades.ra2.ac1.accesdades_ra2_ac1.repositori.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class StudentController {
   
   @Autowired
   StudentRepository studentRepository;

   @GetMapping("/students")
   public List<Student> getStudent() {
        return studentRepository.findAll();   
   }
   
   @PostMapping("/student/add")
   public String addStudent(){
    ArrayList<Student> llista = new ArrayList<>();
    
    int afegits = studentRepository.save(id, nom, cognom, age, cicle, anyo);
    return "Has afegit " + afegits + "Students";
   }

   public String postMethodName(@RequestBody String entity) {
       //TODO: process POST request
       
       return entity;
   }
   
    // Gets per retornar elements de la base de dades
    @GetMapping("/")
        public String getMain(){
            return "This is the main";
        }
    
    @GetMapping("/students/{id}")
        public String getStudent(@PathVariable int id){
            return "Aquest es el estudiant" + id;
        }
}
