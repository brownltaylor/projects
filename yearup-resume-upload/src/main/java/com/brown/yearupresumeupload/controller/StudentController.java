package com.brown.yearupresumeupload.controller;

import com.brown.yearupresumeupload.model.Resume;
import com.brown.yearupresumeupload.model.Student;
import com.brown.yearupresumeupload.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value= "/students")
    public ResponseEntity createStudentRecord(@RequestBody Student student){
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity(newStudent, HttpStatus.CREATED);
    }

    @GetMapping(value= "/students/{id}")
    public ResponseEntity findStudentRecord(@PathVariable("id")Long student_id){
        Optional<Student> targetStudent = studentService.findById(student_id);
        return new ResponseEntity(targetStudent, HttpStatus.OK);
    }

    @GetMapping(value= "/students")
    public ResponseEntity findAllStudentRecords(){
        ArrayList<Student> students = studentService.findAll();
        return new ResponseEntity(students, HttpStatus.OK);
    }

    @GetMapping(value="/{id}/resumes")
    public ResponseEntity findStudentResumes(@PathVariable("id") Long student_id){
        ArrayList<Resume> studentResumes = studentService.findResumesByStudent(student_id);
        return new ResponseEntity(studentResumes, HttpStatus.OK);
    }

    @PutMapping(value= "/students/{id}")
    public ResponseEntity updateStudentRecord(@PathVariable("id") Long student_id, @RequestBody Student student){
        Student newStudent = studentService.updateStudent(student);
        return new ResponseEntity(newStudent, HttpStatus.OK);
    }

    @DeleteMapping(value= "/students/{id}")
    public ResponseEntity deleteStudentRecord(@PathVariable("id") Long student_id){
        studentService.delete(student_id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
