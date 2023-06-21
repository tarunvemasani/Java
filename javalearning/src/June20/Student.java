package June20;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
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

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", GPA: " + gpa;
    }

    public static void main(String[] args) {
        // Create a HashMap of 8 students
        Map<String, Student> studentMap = new HashMap<>();

        // Add students to the HashMap
        studentMap.put("tarun", new Student("tarun","v",3.71));
        studentMap.put("yuvraj", new Student("yuvraj","singh",3.75));
        studentMap.put("steve",new Student("steve","smith",3.65));
        studentMap.put("sachin",new Student("sachin","t",4.0));
        studentMap.put("dhoni",new Student("dhoni","ms",3.9));
        studentMap.put("rohit",new Student("rohit","sharma",3.5));
        studentMap.put("Zaheer",new Student("zaheer","khan",3.45));
        studentMap.put("piyush", new Student("piyush","chawala",3.25));
        // Print the HashMap using Entry set
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("USing map for each method");
        studentMap.forEach((k,v)->System.out.println("Key: " + k + ", Value: " + v));

        System.out.println("Using keyset and iterator");
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student value = studentMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
