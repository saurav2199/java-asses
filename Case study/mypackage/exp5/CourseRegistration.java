package mypackage.exp5;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {

    ArrayList<String> courses = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addCourse() {
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        courses.add(course);
        System.out.println("Course Added Successfully.");
    }

    void removeCourse() {
        System.out.print("Enter Course Name to Remove: ");
        String course = sc.nextLine();

        if (courses.remove(course))
            System.out.println("Course Removed Successfully.");
        else
            System.out.println("Course Not Found.");
    }

    void displayCourses() {

        StringBuffer sb = new StringBuffer();

        sb.append("\nRegistered Courses\n");

        if (courses.isEmpty()) {
            sb.append("No Courses Registered.");
        } else {

            for (String c : courses) {
                sb.append(c).append("\n");
            }
        }

        System.out.println(sb);
    }
}