package com.ust.mysqldoc.Service;

import com.ust.mysqldoc.Model.Student;
import com.ust.mysqldoc.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo s;

    public Student addStudent(Student student) {

        return s.save(student);
    }

    public List<Student> getstudent() {
        return s.findAll();
    }
}
