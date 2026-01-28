package student.management.service;

import student.management.exception.ArrayIndexOutOfBoundException;
import student.management.exception.StudentNotFoundException;
import student.management.model.Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystemServiceImpl implements  StudentManagementSystemService {

    Scanner scanner=new Scanner(System.in);
    //Here , Student Array is used to create static number of Student.
    Student[] students = new Student[10];
    // It is used to store the index of Student so we can fetch data , update , delete also.
    int index = 0;
    //This method is used to add or create Student, and it also validates the input mismatch. It also checks for array storage.
    @Override
    public void addStudent() {
        if(index>= students.length){
            throw new ArrayIndexOutOfBoundException("Array is full");
        }
        try{
        System.out.println("Enter id : ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name : ");
        String name=scanner.nextLine();
        System.out.println("Enter Age : ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter course : ");
        String course=scanner.nextLine();
        System.out.println("Enter Marks : ");
        double marks=scanner.nextDouble();
        Student student = new Student(id, name, age, course, marks);

        students[index++] = student;
        System.out.println("Student added successfully!");
        }
        catch (InputMismatchException e){
            System.out.println("Type is not Matched");
            scanner.nextLine();
        }

    }

    //This method is used to fetch all the students from the added Student model . It validates that index is zero or not .
    @Override
    public Student[] getAllStudent() throws StudentNotFoundException {
        if (index == 0) {
            throw new StudentNotFoundException("No students found in the system");
        }
        Student[] res=new Student[index];
        for(int i=0;i<res.length;i++){
            res[i]=students[i];
        }
        return res;
    }

    //This method is used to fetch Student by id. Validates on certain things like index is zero or not , Student is present or not.
    @Override
    public Student getStudentById(int id) throws StudentNotFoundException {

        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }

        for (int i = 0; i < index; i++) {
            if (students[i].getStudentId() == id) {
                return students[i];
            }
        }

        throw new StudentNotFoundException("Student with ID " + id + " not found");
    }

    //This method is used to update the student by id. Validates on certain things like index is zero or not , Student is present or not.
    @Override
    public Student updateStudent(int id) throws StudentNotFoundException {
        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }

        for (int i = 0; i < index; i++) {
            if (students[i].getStudentId() == id) {
                System.out.println("Enter new Age : ");
                int newAge=scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter new Course: ");
                String newCourse=scanner.nextLine();
                System.out.println("Enter new Marks:");
                double newMarks=scanner.nextDouble();
                students[i].setAge(newAge);
                students[i].setName(newName);
                students[i].setCourse(newCourse);
                students[i].setMarks(newMarks);
                return students[i];
            }
        }

        throw new StudentNotFoundException("Student with ID " + id + " not found");
    }

    //This method is used to delete the Student object. Validates on certain things like index is zero or not , Student is present or not.
    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }
        for (int i = 0; i < index; i++) {
            if (students[i].getStudentId() == id) {

                students[i] = students[index - 1];
                students[index - 1] = null;
                index--;

                System.out.println("Student deleted successfully");

            }
            else {
                throw new StudentNotFoundException("Student with ID " + id + " not found");
            }
        }


    }
}
