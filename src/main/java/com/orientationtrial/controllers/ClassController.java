package com.orientationtrial.controllers;

import com.orientationtrial.models.Class;
import com.orientationtrial.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClassController {
    private final ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping("/class")
    public String addClass(@ModelAttribute Class mentorClass) {
        classService.saveUpdateClass(mentorClass);
        return "redirect:/";
    }

    @PostMapping("/deleteclass/{id}")
    public String deleteClass(Model model, @PathVariable Long id) {
        model.addAttribute("classes", classService.getAllClasses());
        classService.deleteClass(id);
        return "redirect:/";
    }
}
