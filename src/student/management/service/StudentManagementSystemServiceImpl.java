package student.management.service;

import student.management.exception.ArrayFullException;
import student.management.exception.ArrayFullException;
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
                throw new ArrayFullException("Array is full");
            }

        int  id;
        while (true) {
            System.out.println("Enter Id : ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                String idLength=Integer.toString(id);
                int len=idLength.length();
                if (len>=0 && len<=8) {
                    break;
                } else {
                    System.out.println("Id should be up to 8 digits. Try again.");
                }
            } else {
                System.out.println("Id must be an Integer. Try again.");
                scanner.next();
            }
        }
            scanner.nextLine();
                String name;
                while (true) {
                    System.out.println("Enter name : ");
                    name = scanner.nextLine();
                    if (name.matches("[A-Za-z]+")) {
                        break;
                    } else {
                        System.out.println("Invalid name. Only alphabets allowed. Try again.");
                    }
                }

                int age;
                while (true) {
                    System.out.println("Enter Age(18-40) : ");
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();

                        if (age >= 18 && age <= 40) {
                            break;
                        } else {
                            System.out.println("Invalid Age. Try again.");
                        }
                    } else {
                        System.out.println("Age must be an integer. Try again.");
                        scanner.next();
                    }
                }


                scanner.nextLine();
                String course;
                while (true) {
                    System.out.println("Enter course : ");
                    course = scanner.nextLine();
                    if (course.matches("[A-Za-z]+")) {
                        break;
                    } else {
                        System.out.println("Invalid course. Only alphabets allowed. Try again.");
                    }
                }

                double marks;
                    while (true) {
                        System.out.println("Enter Marks(0-100) : ");
                        if (scanner.hasNextDouble()) {
                            marks = scanner.nextDouble();

                            if (marks>=0 && marks<=100) {
                                break;
                            } else {
                                System.out.println("Invalid Marks Range. Try again.");
                            }
                        } else {
                            System.out.println("Marks must be an integer or Double. Try again.");
                            scanner.next();
                        }
                    }
                scanner.nextLine();
                String email;
                while (true) {
                    System.out.println("Enter Email : ");
                    email = scanner.nextLine();
                    if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                        break;
                    } else {
                        System.out.println("Invalid email format. Try again.");
                    }
                }

                Student student = new Student(id, name, age, course, marks, email);

                students[index++] = student;
                System.out.println("Student added successfully!");



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
    public Student getStudentByEmail(String email) throws StudentNotFoundException {

        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }

        for (int i = 0; i < index; i++) {
            if (students[i].getEmail() .equals(email)) {
                return students[i];
            }
        }

        throw new StudentNotFoundException("Student with Email " + email + " not found");
    }

    //This method is used to update the student by id. Validates on certain things like index is zero or not , Student is present or not.
    @Override
    public Student updateStudent(String email) throws StudentNotFoundException {
        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }

        for (int i = 0; i < index; i++) {
            if (students[i].getEmail() .equals(email)) {
                System.out.println("Enter your choice to Update : ");
                System.out.println("1 for Age update : ");
                System.out.println("2 for Name Update : ");
                System.out.println("3 for Course Update : ");
                System.out.println("4 for Marks Update : ");
                System.out.println("5 for Email Update : ");
                System.out.println("6 for Update All : ");
                int choice=scanner.nextInt();
                switch (choice) {
                    case 1 :
                        int newAge;
                        while (true) {
                            System.out.println("Enter Age(18-40) : ");
                            if (scanner.hasNextInt()) {
                                newAge = scanner.nextInt();

                                if (newAge >= 18 && newAge<= 40) {
                                    break;
                                } else {
                                    System.out.println("Invalid Age. Try again.");
                                }
                            } else {
                                System.out.println("Age must be an integer. Try again.");
                                scanner.next();
                            }
                        }
                           students[i].setAge(newAge);
                           return students[i];
                    case 2 :
                        String newName;
                        while (true) {
                            System.out.println("Enter new name : ");
                            newName = scanner.nextLine();
                            if (newName.matches("[A-Za-z]+")) {
                                break;
                            } else {
                                System.out.println("Invalid name. Only alphabets allowed. Try again.");
                            }
                        }
                           students[i].setName(newName);
                           return students[i];
                    case 3 :
                        System.out.println("Enter new Course: ");
                        String newCourse = scanner.nextLine();
                        students[i].setName(newCourse);
                        return students[i];
                    case 4 :
                        double newMarks;
                        while (true) {
                            System.out.println("Enter Marks(0-100) : ");
                            if (scanner.hasNextDouble()) {
                                newMarks = scanner.nextDouble();

                                if (newMarks>=0 && newMarks<=100) {
                                    break;
                                } else {
                                    System.out.println("Invalid Marks Range. Try again.");
                                }
                            } else {
                                System.out.println("Marks must be an integer or Double. Try again.");
                                scanner.next();
                            }
                        }
                          students[i].setMarks(newMarks);
                          return students[i];
                    case 5 :
                        String newEmail;
                        while (true) {
                            System.out.println("Enter new Email : ");
                            newEmail = scanner.nextLine();
                            if (newEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                                break;
                            } else {
                                System.out.println("Invalid email format. Try again.");
                            }
                        }
                        students[i].setEmail(newEmail);
                        return students[i];
                    case 6 :
                        int Age;
                        while (true) {
                            System.out.println("Enter Age(18-40) : ");
                            if (scanner.hasNextInt()) {
                                Age = scanner.nextInt();

                                if (Age >= 18 && Age <= 40) {
                                    break;
                                } else {
                                    System.out.println("Invalid Age. Try again.");
                                }
                            } else {
                                System.out.println("Age must be an integer. Try again.");
                                scanner.next();
                            }
                        }

                        students[i].setAge(Age);
                        scanner.nextLine();
                        String Name;
                        while (true) {
                            System.out.println("Enter new name : ");
                            Name = scanner.nextLine();
                            if (Name.matches("[A-Za-z]+")) {
                                break;
                            } else {
                                System.out.println("Invalid name. Only alphabets allowed. Try again.");
                            }
                        }
                        students[i].setName(Name);
                        System.out.println("Enter new Course: ");
                        String Course = scanner.nextLine();
                        students[i].setCourse(Course);
                        double Marks;
                        while (true) {
                            System.out.println("Enter Marks(0-100) : ");
                            if (scanner.hasNextDouble()) {
                                Marks = scanner.nextDouble();

                                if (Marks>=0 && Marks<=100) {
                                    break;
                                } else {
                                    System.out.println("Invalid Marks Range. Try again.");
                                }
                            } else {
                                System.out.println("Marks must be an integer or Double. Try again.");
                                scanner.next();
                            }
                        }
                        students[i].setMarks(Marks);
                        scanner.nextLine();
                        String Email;
                        while (true) {
                            System.out.println("Enter new Email : ");
                            Email = scanner.nextLine();
                            if (Email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                                break;
                            } else {
                                System.out.println("Invalid email format. Try again.");
                            }
                        }
                        students[i].setEmail(Email);
                        return students[i];
                    default:
                        System.out.println("Option not exist!!");
                        break;
                }
            }
        }

        throw new StudentNotFoundException("Student with Email " + email + " not found");
    }

    //This method is used to delete the Student object. Validates on certain things like index is zero or not , Student is present or not.
    @Override
    public void deleteStudent(String email) throws StudentNotFoundException {
        if (index == 0) {
            throw new StudentNotFoundException("No students available");
        }
        for (int i = 0; i < index; i++) {
            if (students[i].getEmail() .equals(email)) {

                students[i] = students[index - 1];
                students[index - 1] = null;
                index--;

                System.out.println("Student deleted successfully");

            }
            else {
                throw new StudentNotFoundException("Student with Email " + email + " not found");
            }
        }


    }
}
