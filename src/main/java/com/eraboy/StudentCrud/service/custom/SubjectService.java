package com.eraboy.StudentCrud.service.custom;

import com.eraboy.StudentCrud.entity.Student;
import com.eraboy.StudentCrud.entity.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {
    void saveSubject(Subject subject);

    void deleteSubject(long id);

    void updateSubject(Subject subject);

    List<Subject> getAllSubjects();

    Optional<Subject> searchSubject(long id);
}
