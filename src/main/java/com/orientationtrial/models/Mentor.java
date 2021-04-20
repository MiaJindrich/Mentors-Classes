package com.orientationtrial.models;

import javax.persistence.*;

@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Class mentorClass;

    public Mentor(String name, Class mentorClass) {
        this.id = null;
        this.name = name;
        this.mentorClass = mentorClass;
    }

    public Mentor(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Class getMentorClass() {
        return mentorClass;
    }

    public void setMentorClass(Class mentorClass) {
        this.mentorClass = mentorClass;
    }
}


