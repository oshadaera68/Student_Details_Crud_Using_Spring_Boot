package com.eraboy.StudentCrud.repo;

import com.eraboy.StudentCrud.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
