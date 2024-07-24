package edu.practic.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.practic.dto.Student;
import edu.practic.entity.StudentEntity;
import edu.practic.repository.StudentRepository;
import edu.practic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public Student createStudent(Student student) {

        StudentEntity studentEntity
                = mapper.convertValue(student, StudentEntity.class);

        StudentEntity savedStudent = repository.save(studentEntity);

        student.setId(savedStudent.getId());

        return student;

    }

    @Override
    public List<Student> retriveStudent() {
        final Iterable<StudentEntity> allStudent = repository.findAll();

        List<Student> studentList= new ArrayList<>();

        allStudent.forEach(studentEntity -> {
            studentList.add(
                    mapper.convertValue(studentEntity,Student.class));
        });

        return studentList;
    }

    @Override
    public void deleteStudentById(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateStudent(Student student) {
        if (repository.findById(student.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(student, StudentEntity.class));
        }
    }
}
