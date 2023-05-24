package com.eraboy.StudentCrud.service.custom;

import com.eraboy.StudentCrud.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void saveStudent(Student s);

    void deleteStudent(long id);

    void updateStudent(Student s);

    List<Student> getAllStudents();

    Optional<Student> searchStudent(long id);
}
