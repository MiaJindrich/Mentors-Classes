package com.orientationtrial.services;

import com.orientationtrial.models.Class;
import com.orientationtrial.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    public ClassRepository classRepository;

    @Autowired
    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class findClass(Long id) {
        return classRepository.getOne(id);
    }

    public void saveUpdateClass(Class mentorClass) {
        classRepository.save(mentorClass);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
