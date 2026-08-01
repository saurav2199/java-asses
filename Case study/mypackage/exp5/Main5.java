package mypackage.exp5;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CourseRegistration obj = new CourseRegistration();

        int choice;

        do {

            System.out.println("\n===== Student Course Registration =====");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    obj.addCourse();
                    break;

                case 2:
                    obj.removeCourse();
                    break;

                case 3:
                    obj.displayCourses();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}