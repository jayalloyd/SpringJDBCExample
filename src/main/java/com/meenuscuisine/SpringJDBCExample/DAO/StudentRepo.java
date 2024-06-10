package com.meenuscuisine.SpringJDBCExample.DAO;

import com.meenuscuisine.SpringJDBCExample.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public static void save() {
        System.out.println("added successfully");
    }

    public static List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }
}
