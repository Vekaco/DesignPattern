package data_access_object_pattern.dao;

import data_access_object_pattern.java_bean.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();
    boolean addStudent(Student student);
    boolean removeStudent(Student student);
    boolean updateStudent(Student student);

}
