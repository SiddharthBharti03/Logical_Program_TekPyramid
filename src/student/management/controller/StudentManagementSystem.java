package student.management.controller;

import student.management.exception.StudentNotFoundException;
import student.management.model.Student;
import student.management.service.StudentManagementSystemService;
import student.management.service.StudentManagementSystemServiceImpl;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManagementSystemService st=new StudentManagementSystemServiceImpl();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter choice : ");
        //Here while loop is used to continuous running the application until the user not exit .
        while(true){
            System.out.println("Enter 1 for Add Student :");
            System.out.println("Enter 2 for View All Student :");
            System.out.println("Enter 3 for Search for Student ID :");
            System.out.println("Enter 4 for Update Student Details :");
            System.out.println("Enter 5 for Delete Student :");
            System.out.println("Enter 6 for Exit from Application :");
            int choice=scanner.nextInt();
            //user can choose from the above option .
            switch (choice){
                case 1 :
                    st.addStudent();
                    break;
                case 2 :
                    try {
                        Student[] allStudents = st.getAllStudent();
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3 :
                    try {
                        System.out.println("Enter the id : ");
                        int id=scanner.nextInt();
                        Student allStudents = st.getStudentById(id);
                        System.out.println(allStudents);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4 :
                    try{
                        System.out.println("Enter the id : ");
                        int id=scanner.nextInt();
                        Student updateStudents=st.updateStudent(id);
                        System.out.println(updateStudents);
                    }catch (StudentNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5 :
                    try{
                        System.out.println("Enter the id : ");
                        int id=scanner.nextInt();
                        st.deleteStudent(id);
                    }catch (StudentNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6 :
                    System.out.println("Thank You for Using this Application !!");
                    System.exit(0);
                    return;
            }
        }


    }
}
