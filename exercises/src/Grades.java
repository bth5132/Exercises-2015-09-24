/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */
import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    // One grade
    int grade;
    // The number of grades
    int count = 0;
    // Total of the grades
    float total = 0;
    
    for (;;) {
        System.out.println("Enter a grade: ");
        grade = keyboard.nextInt();
        if (grade == -1) {
            break;
        }
        total += grade;
        count++;
    }
    
    System.out.println("count: " + count);
    System.out.println("total: " + total);
    System.out.println("average: " + total / count);
    }    
  }


