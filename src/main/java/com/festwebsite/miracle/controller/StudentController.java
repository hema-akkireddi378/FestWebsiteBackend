package com.festwebsite.miracle.controller;

import com.festwebsite.miracle.model.Student;               // ✅ Import model
import com.festwebsite.miracle.repository.StudentRepository; // ✅ Import repo
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:5173", "https://fest-website-nine.vercel.app"  })  // allow frontend requests
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // ✅ POST: Save student from frontend
    @PostMapping("/register")
    public ResponseEntity<Void> registerStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return ResponseEntity.noContent().build(); // HTTP 204
    }



    // ✅ GET: Return all registered students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
