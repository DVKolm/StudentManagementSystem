package com.example.Storage;

import com.example.entity.Student;

import java.util.List;

public interface StudentStorage {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
