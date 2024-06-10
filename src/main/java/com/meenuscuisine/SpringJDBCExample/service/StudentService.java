package com.meenuscuisine.SpringJDBCExample.service;

import com.meenuscuisine.SpringJDBCExample.DAO.StudentRepo;
import com.meenuscuisine.SpringJDBCExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }
    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public  void addStudent(Student s){
        StudentRepo.save(s);
    System.out.println("added");
    }

    public List<Student> getStudent() {
        return StudentRepo.findAll();
    }
}
