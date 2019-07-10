package com.brown.yearupresumeupload.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Education {

    @Id
    @GeneratedValue
    private Long education_id;
    @OneToOne
    private Date from;
    @OneToOne
    private Date to;
    private String school;
    private Double GPA;
    private String comments;

    public Education(){

    }

    public Long getEducation_id() {
        return education_id;
    }

    public void setEducation_id(Long education_id) {
        this.education_id = education_id;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
