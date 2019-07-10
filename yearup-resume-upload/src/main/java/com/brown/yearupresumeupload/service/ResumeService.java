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
public class ResumeService {

    @Autowired
    public ResumeRepository resumeRepository;
    @Autowired
    public StudentRepository studentRepository;

    public Resume saveResume(Long student_id, Resume resume){
        resume.setStudent_id(student_id);
        return resumeRepository.save(resume);
    }

    public Optional<Resume> findResumeById(Long resume_id){
        return resumeRepository.findById(resume_id);
    }

    public ArrayList<Resume> findAllResumes(){
        Iterable<Resume> resumes = resumeRepository.findAll();
        ArrayList<Resume> resumelist = new ArrayList<>();
        for(Resume resume : resumes) {
            resumelist.add(resume);
        }
        return resumelist;
    }

    public Student findStudentByResume(Long resume_id){
        return studentRepository.findById(resume_id).get();
    }

    public Resume updateResume(Resume resume){
        return resumeRepository.save(resume);
    }

    public void deleteResume(Long resume_id){
        resumeRepository.deleteById(resume_id);
    }
}