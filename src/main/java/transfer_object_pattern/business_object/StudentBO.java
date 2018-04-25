package transfer_object_pattern.business_object;

import transfer_object_pattern.transfer_object.StudentVO;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    private static List<StudentVO> students = new ArrayList<StudentVO>();

    public List<StudentVO> getAllStudents(){
        return students;
    }

    public void addStudent(StudentVO student) {
        students.add(student);
    }

    public void removeStudent(StudentVO studentVO) {
        students.remove(studentVO);
    }

    public void updateStudent(StudentVO newStudent) {
        StudentVO student = students.get(newStudent.getRollNo());
        if(student != null) {
            student.setName(newStudent.getName());
        }
    }
}
