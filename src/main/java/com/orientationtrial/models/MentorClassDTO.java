package com.orientationtrial.models;

public class MentorClassDTO {
    private String mentorName;
    private Long classId;

    public MentorClassDTO(String mentorName, Long classId) {
        this.mentorName = mentorName;
        this.classId = classId;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
