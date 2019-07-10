package com.brown.yearupresumeupload.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Resume {

    @Id
    @GeneratedValue
    private Long resume_id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private Long student_id;
    @OneToMany
    private Set<Achievement> achievements;
    @OneToMany
    private Set<WorkExperience> workExperience;
    @OneToMany
    private Set<Education> education;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reference> references;

    public Resume(){

    }

    public Long getResume_id() {
        return resume_id;
    }

    public void setResume_id(Long resume_id) {
        this.resume_id = resume_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Set<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Set<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Set<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public Set<Education> getEducation() {
        return education;
    }

    public void setEducation(Set<Education> education) {
        this.education = education;
    }

    public Set<Reference> getReferences() {
        return references;
    }

    public void setReferences(Set<Reference> references) {
        this.references = references;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", achievements=" + achievements +
                ", workExperience=" + workExperience +
                ", education=" + education +
                ", references=" + references +
                '}';
    }
}
