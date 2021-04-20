package com.orientationtrial.controllers;

import com.orientationtrial.models.Class;
import com.orientationtrial.models.MentorClassDTO;
import com.orientationtrial.services.ClassService;
import com.orientationtrial.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MentorController {
    private final MentorService mentorService;
    private final ClassService classService;

    @Autowired
    public MentorController(MentorService mentorService, ClassService classService) {
        this.mentorService = mentorService;
        this.classService = classService;
    }

    @GetMapping ("/")
    public String mainPage(Model model) {
        model.addAttribute("mentors", mentorService.getAllMentors());
        model.addAttribute("classes", classService.getAllClasses());
        return "index";
    }

    @GetMapping ("/mentor/{id}")
    public String detail(Model model, @PathVariable Long id) {
        model.addAttribute("mentor", mentorService.findMentor(id));
        return "detail";
    }

    @PostMapping ("/mentor")
    public String addMentor(@ModelAttribute MentorClassDTO mentorClassDTO) {
        mentorService.addMentorDTO(mentorClassDTO);
        return "redirect:/";
    }
}
