package com.ust.mysqldoc.Controller;

import com.ust.mysqldoc.Model.Student;
import com.ust.mysqldoc.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addstudent")
    public Student addStudent(Student student) {
       return studentService.addStudent(student);


    }
    @GetMapping("/getstudents")
    public List<Student> getStudents()
    {
        return studentService.getstudent();
    }
}
