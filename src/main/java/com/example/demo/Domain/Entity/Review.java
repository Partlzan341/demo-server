package com.example.demo.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    String name;
    String comment;
    LocalDate dateOfCreate;
    LocalTime timeOfCreate;

    public Review() {
    }

    public Review(int id, String name, String comment, LocalDate dateOfCreate, LocalTime timeOfCreate) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.dateOfCreate = dateOfCreate;
        this.timeOfCreate = timeOfCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(LocalDate dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public LocalTime getTimeOfCreate() {
        return timeOfCreate;
    }

    public void setTimeOfCreate(LocalTime timeOfCreate) {
        this.timeOfCreate = timeOfCreate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", dateOfCreate=" + dateOfCreate +
                ", timeOfCreate=" + timeOfCreate +
                '}';
    }
}
