package com.brown.yearupresumeupload.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Achievement {

    @Id
    @GeneratedValue
    private Long achievement_id;
    @OneToOne
    private Date from;
    @OneToOne
    private Date to;
    private String achievement;
    private String description;

    public Achievement(){

    }

    public Long getAchievement_id() {
        return achievement_id;
    }

    public void setAchievement_id(Long achievement_id) {
        this.achievement_id = achievement_id;
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

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "achievement_id=" + achievement_id +
                ", from=" + from +
                ", to=" + to +
                ", achievement='" + achievement + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
