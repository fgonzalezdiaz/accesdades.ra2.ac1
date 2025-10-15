package com.accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    // Gets per retornar elements de la base de dades
    @GetMapping("/")
        public String getMain(){
            return "This is the main";
        }
    

    @GetMapping("/students")
        public String getStudents(){
            return "This return all the students";
        }
    @GetMapping("/students/{id}")
        public String getStudent(@PathVariable int id){
            return "Aquest es el estudiant" + id;
        }
}
