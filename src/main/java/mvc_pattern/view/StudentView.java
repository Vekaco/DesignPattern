package mvc_pattern.view;

import mvc_pattern.model.Student;

public class StudentView {
    public void printStudentMessage(String rollNo, String name) {
        System.out.println("[" + rollNo + "]" + name);
    }
}
