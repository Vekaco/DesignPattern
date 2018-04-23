package mvc_pattern.controller;

import mvc_pattern.model.Student;
import mvc_pattern.view.StudentView;

public class StudentController {
    Student model;
    StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }


    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void updateView(){
        view.printStudentMessage(model.getRollNo(),model.getName());
    }
}
