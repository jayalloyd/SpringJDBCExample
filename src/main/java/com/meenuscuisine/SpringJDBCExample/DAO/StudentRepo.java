package com.meenuscuisine.SpringJDBCExample.DAO;

import com.meenuscuisine.SpringJDBCExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    
    private static JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
       @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public static void save(Student s) {
        String sql="insert into student(rollno,name,marks) values(?,?,?)";
        int rows= jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println("added successfully rows ="+rows);
    }

    public static List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }
}
