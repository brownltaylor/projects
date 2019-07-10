package com.brown.yearupresumeupload.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Date {

    @Id
    @GeneratedValue
    private Long date_id;
    private int month;
    private int day;
    private int year;

   public Date(){

   }

    public Long getDate_id() {
        return date_id;
    }

    public void setDate_id(Long date_id) {
        this.date_id = date_id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date_id=" + date_id +
                ", month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
