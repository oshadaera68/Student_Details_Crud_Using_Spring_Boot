package com.eraboy.StudentCrud.service.custom.impl;

import com.eraboy.StudentCrud.entity.Student;
import com.eraboy.StudentCrud.repo.StudentRepo;
import com.eraboy.StudentCrud.service.custom.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the student id..");
        }
    }

    @Override
    public void updateStudent(Student student) {
        if (studentRepo.existsById(student.getId())) {
            studentRepo.save(student);
        } else {
            throw new RuntimeException("No such student to update, Please check the id..");
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Optional<Student> searchStudent(long id) {
        return studentRepo.findById(id);
    }
}
