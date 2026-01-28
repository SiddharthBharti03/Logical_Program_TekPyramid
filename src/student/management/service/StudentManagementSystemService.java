package student.management.service;

import student.management.exception.StudentNotFoundException;
import student.management.model.Student;

public interface StudentManagementSystemService {
    void addStudent();
    Student[] getAllStudent() throws StudentNotFoundException;
    Student getStudentByEmail(String email) throws StudentNotFoundException;
    Student updateStudent(String email) throws StudentNotFoundException;
    void deleteStudent(String email) throws StudentNotFoundException;

}
