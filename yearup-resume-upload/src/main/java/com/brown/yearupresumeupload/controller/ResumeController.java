package com.brown.yearupresumeupload.controller;

import com.brown.yearupresumeupload.model.Resume;
import com.brown.yearupresumeupload.model.Student;
import com.brown.yearupresumeupload.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @PostMapping(value = "/{id}/resumes")
    public ResponseEntity uploadResume(@PathVariable("id") Long student_id, @RequestBody Resume resume) {
        Resume newResume = resumeService.saveResume(student_id, resume);
        return new ResponseEntity(newResume, HttpStatus.CREATED);
    }

    @GetMapping(value = "/resumes/{id}")
    public ResponseEntity findResumeById(@PathVariable("id") Long resume_id) {
        Optional<Resume> resume = resumeService.findResumeById(resume_id);
        return ResponseEntity.status(HttpStatus.OK).body(resume);
    }

    @GetMapping(value= "/resumes")
    public ResponseEntity findAllResumes(){
        ArrayList<Resume> resumes = resumeService.findAllResumes();
        return new ResponseEntity(resumes, HttpStatus.OK);
    }

    @GetMapping(value= "/resumes/{resume_id}/student")
    public ResponseEntity findResumeOwner(@PathVariable("resume_id") Long resume_id){
        Student student = resumeService.findStudentByResume(resume_id);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @PutMapping(value= "/resumes/{id}")
    public ResponseEntity updateResume(@PathVariable("id") Long resume_id, @RequestBody Resume resume){
        Resume newResume = resumeService.updateResume(resume);
        return new ResponseEntity(newResume, HttpStatus.OK);
    }

    @DeleteMapping(value= "/resumes/{id}")
    public ResponseEntity deleteResume(@PathVariable("id") Long resume_id){
        resumeService.deleteResume(resume_id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
