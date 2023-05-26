package com.eraboy.StudentCrud.service.custom;

import com.eraboy.StudentCrud.entity.Diploma;
import com.eraboy.StudentCrud.entity.Student;

import java.util.List;
import java.util.Optional;

public interface DiplomaService {
    void saveDiploma(Diploma d);

    void deleteDiploma(long id);

    void updateDiploma(Diploma d);

    List<Diploma> getAllDiplomas();

    Optional<Diploma> searchDiploma(long id);
}
