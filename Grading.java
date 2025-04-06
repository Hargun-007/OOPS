import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        String[] names = new String[numStudents];
        int[][] marks = new int[numStudents][3];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks for Subject 1: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter marks for Subject 2: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter marks for Subject 3: ");
            marks[i][2] = sc.nextInt();
            sc.nextLine();

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;

            if (average >= 90) {
                grades[i] = 'A';
            } else if (average >= 80) {
                grades[i] = 'B';
            } else if (average >= 70) {
                grades[i] = 'C';
            } else if (average >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Subject 1: " + marks[i][0]);
            System.out.println("Subject 2: " + marks[i][1]);
            System.out.println("Subject 3: " + marks[i][2]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
