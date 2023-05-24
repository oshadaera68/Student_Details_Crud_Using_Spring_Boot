package com.eraboy.StudentCrud.repo;

import com.eraboy.StudentCrud.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
