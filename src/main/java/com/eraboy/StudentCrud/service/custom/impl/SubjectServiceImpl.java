package com.eraboy.StudentCrud.service.custom.impl;

import com.eraboy.StudentCrud.entity.Subject;
import com.eraboy.StudentCrud.repo.SubjectRepo;
import com.eraboy.StudentCrud.service.custom.SubjectService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;


    @Override
    public void saveSubject(Subject subject) {
            subjectRepo.save(subject);
    }

    @Override
    public void deleteSubject(long id) {
        if (subjectRepo.existsById(id)) {
            subjectRepo.deleteById(id);
        } else {
            throw new RuntimeException("No such subject to update, Please check the id..");
        }
    }

    @Override
    public void updateSubject(Subject s) {
        if (subjectRepo.existsById(s.getSubCode())) {
            subjectRepo.save(s);
        } else {
            throw new RuntimeException("No such subject to update, Please check the id..");
        }
    }

    @Override
    public List<Subject> getAllSubjects() {
        return (List<Subject>) subjectRepo.findAll();
    }

    @Override
    public Optional<Subject> searchSubject(long id) {
        return subjectRepo.findById(id);
    }
}
