package student.management.model;

public class Student {
   private int studentId;
   private String name;
   private int age;
   private String course;
   private double marks;
   private String email;

    public Student(int studentId, String name, int age, String course, double marks,String email) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.email=email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                ", email='" + email + '\'' +
                '}';
    }
}

