package com.example.myapp.DAO;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudent(int r);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
