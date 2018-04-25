package data_access_object_pattern.demo;

import data_access_object_pattern.dao.impl.StudentDaoImpl;
import data_access_object_pattern.java_bean.Student;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();

        studentDao.addStudent(new Student(0,"Andy"));
        studentDao.addStudent(new Student(1,"Tom"));

        for(Student student: studentDao.getAllStudents()) {
            printStudent(student);
        }


    }


    private static void printStudent(Student student){
        System.out.println("[" + student.getRollNo() + "]" + student.getName());
    }
}
