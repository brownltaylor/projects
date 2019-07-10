package com.brown.yearupresumeupload.service;

import com.brown.yearupresumeupload.model.Resume;
import com.brown.yearupresumeupload.model.Student;
import com.brown.yearupresumeupload.repository.ResumeRepository;
import com.brown.yearupresumeupload.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ResumeRepository resumeRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> findById(Long student_id){
        return studentRepository.findById(student_id);
    }

    public ArrayList<Student> findAll() {
        Iterable<Student> allStudents = studentRepository.findAll();
        ArrayList<Student> studentList = new ArrayList<>();
        for (Student student : allStudents) {
            studentList.add(student);
        }
        return studentList;
    }

    public ArrayList<Resume> findResumesByStudent(Long student_id){
        Iterable<Resume> allResumes = resumeRepository.findAll();
        Iterable<Student> allStudents = studentRepository.findAll();
        ArrayList<Resume> studentResumes = new ArrayList<>();
        for(Resume resume : allResumes) {
            for (Student student : allStudents) {
                if (resume.getStudent_id() == student.getStudent_id()) {
                    studentResumes.add(resume);
                }
            }
        }
        return studentResumes;
    }

    public Student updateStudent(Student student){
        Student newStudent = studentRepository.save(student);
        return newStudent;
    }

    public void delete(Long student_id){
        studentRepository.deleteById(student_id);
    }
}
