import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = Integer.parseInt(sc.nextLine());

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            String input = sc.nextLine();
            Integer marks = Integer.valueOf(input);
            total += marks;
        }

        System.out.println("Total Marks: " + total);

        sc.close();
    }
}