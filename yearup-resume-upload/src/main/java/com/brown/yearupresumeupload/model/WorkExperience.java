package com.brown.yearupresumeupload.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WorkExperience {

    @Id
    @GeneratedValue
    private Long workExperience_id;
    private String company;
    @OneToOne
    private Date from;
    @OneToOne
    private Date to;
    private String job_description;
    private String manager;
    private String phone;
    private String city;
    private String state;

    public WorkExperience(){

    }

    public Long getWorkExperience_id() {
        return workExperience_id;
    }

    public void setWorkExperience_id(Long workExperience_id) {
        this.workExperience_id = workExperience_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workExperience_id=" + workExperience_id +
                ", company='" + company + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", job_description='" + job_description + '\'' +
                ", manager='" + manager + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
