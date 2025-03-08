   import java.util.Scanner;
    
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / subjects;

        char grade;
        if (averagePercentage >= 90) grade = 'A';
        else if (averagePercentage >= 80) grade = 'B';
        else if (averagePercentage >= 70) grade = 'C';
        else if (averagePercentage >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
