package com.mongo.example.mongodbexample.controller;
import com.mongo.example.mongodbexample.model.Student;
import com.mongo.example.mongodbexample.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class Mycontroller {

    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/")
   // public ResponseEntity<?> addStudent(@RequestBody Student student) {
    public String addStudent(@RequestBody Student student) {

    Student save = this.studentRepository.save(student);
      //  return ResponseEntity.ok(save);
        return "data entered";
    }
    @GetMapping("/")
    public ResponseEntity<?> getStudents() {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
        @DeleteMapping("{id}")
        public String deleteById(@PathVariable("id") Student id ) {
            this.studentRepository.delete(id);
            return "Deleted";
        }
    @DeleteMapping("/")
    public String delete (@RequestBody Student student ) {
        this.studentRepository.deleteAll();
        return "Deleted";
    }
        @PutMapping("/")
        public ResponseEntity<?> updateStudent(@RequestBody Student student)
        {
            return ResponseEntity.ok(studentRepository.save(student));
        }
   }
