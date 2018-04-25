package transfer_object_pattern.demo;

import transfer_object_pattern.business_object.StudentBO;
import transfer_object_pattern.transfer_object.StudentVO;

public class TransferObjectPattern {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        studentBO.addStudent(new StudentVO(0, "Tommy"));
        studentBO.addStudent(new StudentVO(1,"Andy"));

        for(StudentVO student: studentBO.getAllStudents()) {
            printStudent(student);
        }

    }

    private static void printStudent(StudentVO student) {
        System.out.println("[" + student.getRollNo() +"]" + student.getName());
    }
}
