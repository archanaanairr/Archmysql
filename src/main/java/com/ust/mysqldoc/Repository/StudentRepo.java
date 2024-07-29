package com.ust.mysqldoc.Repository;

import com.ust.mysqldoc.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
