package com.orientationtrial.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "mentorClass")
    private List<Mentor> mentors;

    public Class(String name) {
        this.id = null;
        this.name = name;
//        this.mentors = new ArrayList<>();
    }

    public Class() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }
}
