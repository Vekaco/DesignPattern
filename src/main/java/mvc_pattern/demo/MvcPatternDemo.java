package mvc_pattern.demo;

import mvc_pattern.controller.StudentController;
import mvc_pattern.model.Student;
import mvc_pattern.view.StudentView;

public class MvcPatternDemo {
    public static void main(String[] args) {
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.setStudentName("Sam");
        controller.setStudentRollNo("1024");
        controller.updateView();


        controller.setStudentName("Tom");
        controller.updateView();

    }
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
