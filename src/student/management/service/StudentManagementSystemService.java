package student.management.service;

import student.management.exception.StudentNotFoundException;
import student.management.model.Student;

public interface StudentManagementSystemService {
    void addStudent();
    Student[] getAllStudent() throws StudentNotFoundException;
    Student getStudentById(int id) throws StudentNotFoundException;
    Student updateStudent(int id) throws StudentNotFoundException;
    void deleteStudent(int id) throws StudentNotFoundException;

}
