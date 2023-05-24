package com.eraboy.StudentCrud.controller;

import com.eraboy.StudentCrud.entity.Student;
import com.eraboy.StudentCrud.entity.Subject;
import com.eraboy.StudentCrud.service.custom.SubjectService;
import com.eraboy.StudentCrud.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
@CrossOrigin
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllSubjects() {
        return new ResponseUtil(200, "ok", subjectService.getAllSubjects());
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseUtil saveSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return new ResponseUtil(200, "Saved subject", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateSubject(@RequestBody Subject subject) {
        subjectService.updateSubject(subject);
        return new ResponseUtil(200, "update student", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchSubject(@PathVariable long id) {
        return new ResponseUtil(200, "OK", subjectService.searchSubject(id));
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteSubject(@RequestParam long id) {
        subjectService.deleteSubject(id);
        return new ResponseUtil(200, "Deleted", null);
    }
}
