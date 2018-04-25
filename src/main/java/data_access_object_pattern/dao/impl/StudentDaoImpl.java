package data_access_object_pattern.dao.impl;

import data_access_object_pattern.dao.StudentDao;
import data_access_object_pattern.java_bean.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private static List<Student> students = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public boolean updateStudent(Student newStudent) {

        Student student = students.get(newStudent.getRollNo());

        if(student != null) {
            student.setName(newStudent.getName());
            return true;
        }
        return false;
    }
}
