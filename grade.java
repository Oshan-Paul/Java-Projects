import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Grade Sheet");
        System.out.println("=================================================");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        int totalMarks = scanner.nextInt();
        System.out.print("Enter Marks Obtained: ");
        int obtainedMarks = scanner.nextInt();
        double percentage =(obtainedMarks/(double) totalMarks)*100;
        String grade;
        if (percentage>=90){
            grade = "A+";
        } else if (percentage>=80) {
            grade = "A";
        }else if (percentage>=70) {
            grade = "B";
        }else if (percentage>=60) {
            grade = "C";
        }else if (percentage>=50) {
            grade = "D";
        }else if (percentage>=40) {
            grade = "E";
        }else {
            grade = "F";
        }
        System.out.println("=================================================");
        System.out.println("Grade Sheet");
        System.out.println("=================================================");
        System.out.printf("Student Name    : %s%n", name);
        System.out.printf("Roll Number     : %s%n", rollNumber);
        System.out.printf("Total Marks     : %d%n", totalMarks);
        System.out.printf("Marks Obtained  : %d%n", obtainedMarks);
        System.out.printf("Percentage      : %.2f%%%n", percentage);
        System.out.printf("Grade           : %s%n", grade);
        System.out.println("========================================");

        scanner.close();

    }}