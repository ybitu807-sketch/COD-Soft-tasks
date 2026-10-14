import java.util.Scanner;
public class StudentGradeCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter marks in Subject 1: ");
int s1 = sc.nextInt();
System.out.print("Enter marks in Subject 2: ");
int s2 = sc.nextInt();
System.out.print("Enter marks in Subject 3: ");
int s3 = sc.nextInt();
System.out.print("Enter marks in Subject 4: ");
int s4 = sc.nextInt();
System.out.print("Enter marks in Subject 5: ");
int s5 = sc.nextInt();
int total = s1 + s2 + s3 + s4 + s5;
double average = total / 5.0;
String grade;
if (average >= 90) {
grade = "A";
} else if (average >= 75) {
grade = "B";
} else if (average >= 60) {
grade = "C";
} else if (average >= 40) {
grade = "D";
} else {
grade = "F";
}
System.out.println("\nTotal Marks = " + total);
System.out.println("Average = " + average);
System.out.println("Grade = " + grade);
sc.close();
}
}