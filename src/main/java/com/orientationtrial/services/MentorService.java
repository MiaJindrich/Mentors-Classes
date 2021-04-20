package com.orientationtrial.services;

import com.orientationtrial.models.Class;
import com.orientationtrial.models.Mentor;
import com.orientationtrial.models.MentorClassDTO;
import com.orientationtrial.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorService {
    private final MentorRepository mentorRepository;
    private final ClassService classService;

    @Autowired
    public MentorService(MentorRepository mentorRepository, ClassService classService) {
        this.mentorRepository = mentorRepository;
        this.classService = classService;
    }

    public void addMentorDTO(MentorClassDTO mentorClassDTO) {
        Class mentorClass = classService.findClass(mentorClassDTO.getClassId());
        Mentor mentor = new Mentor(mentorClassDTO.getMentorName(), mentorClass);
        saveUpdateMentor(mentor);
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentor findMentor(Long id) {
        return mentorRepository.getOne(id);
    }

    public void saveUpdateMentor(Mentor mentor) {
        mentorRepository.save(mentor);
    }

    public void deleteMentor(Long id) {
        mentorRepository.deleteById(id);
    }
}
