import java.util.Scanner;
public class StudentGrades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter grade:  ");
        int grade = input.nextInt();
        

        if (grade >= 90) {
            System.out.print("A\n");
    }
        else if (grade >= 80) {
            System.out.print("B\n");    
    }    
        else if (grade >= 70) {
            System.out.print("C\n");
    }
        else if (grade >= 60) {
            System.out.print("D\n");
    }
        if (grade = 55) {
            System.out.print("You passed this course.\n");
    }
        else {
            System.out.print("F\n");
            System.out.print("You must take this course again.\n");
        }
      }
    }
  
