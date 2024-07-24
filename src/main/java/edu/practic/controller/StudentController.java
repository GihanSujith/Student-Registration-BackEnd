package edu.practic.controller;

import edu.practic.dto.Student;
import edu.practic.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    final StudentService service;

    StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping()
    Student save(@RequestBody Student student){
       return service.createStudent(student);

    }

    @GetMapping ()
    List<Student> retrive(){
        return service.retriveStudent();

    }

    @DeleteMapping("/delete-std/{id}")
    public String delete(@PathVariable Integer id){
        service.deleteStudentById(id);
        return "Deleted";
    }

    @PutMapping()
    public void update(@RequestBody Student student){
        service.updateStudent(student);
    }
}
