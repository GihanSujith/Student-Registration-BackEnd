package edu.practic.service;

import edu.practic.dto.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> retriveStudent();

    void deleteStudentById(Integer id);

    void updateStudent(Student student);

}
