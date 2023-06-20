package june16;


import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {
    private String firstName;
    private String lastName;
    private double gpa;

    public StudentArrayList(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }

    public static void main(String[] args) {
        // Create the list of students
        ArrayList<StudentArrayList> students = new ArrayList<>();
        students.add(new StudentArrayList("Yuvraj", "Singh", 3.7));
        students.add(new StudentArrayList("Sachin", "Tendulkar", 4.0));
        students.add(new StudentArrayList("Mike", "Johnson", 2.5));
        students.add(new StudentArrayList("Steve", "Smith", 3.2));
        students.add(new StudentArrayList("David", "Tim", 3.9));

        // Calculate the average GPA
        double totalGpa = 0;
        for (StudentArrayList student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        // Remove students with GPA less than the average GPA
        Iterator<StudentArrayList> iterator = students.iterator();
        while (iterator.hasNext()) {
            StudentArrayList student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }

        // Print the remaining students
        for (StudentArrayList student : students) {
            System.out.println(student);
        }
    }
}
