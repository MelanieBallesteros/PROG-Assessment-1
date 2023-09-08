
/**
 * Write a description of class StudentMarksAnalyzer here.
 *
 * @author (Melanie Ballesteros)
 * @version (a version number or a date)
 */


import java.util.Scanner;


public class StudentMarksAnalyzer
{
   //double[] studentMarks = new double[30];
   
    public static void main (String[] args){
       int[] marks = new int[30];
       int studentCount = 0;
       
       Scanner scanner = new Scanner(System.in); //Create a Scanner object to read input from the user
       System.out.print("Please enter the assignment name: "); //Input the assignment name
       String assignmentName = scanner.nextLine();
       System.out.println("Assignment Name entered is: " + assignmentName);
    
       while (studentCount < 30) {
           System.out.print("Enter mark for student " + (studentCount + 1) + " : ");
           int mark = scanner.nextInt();
           
           if (mark >= 0 && mark <= 30){
               marks[studentCount] = mark;
               studentCount++;
            }
            else {
                System.out.println("Invalid mark input! Mark must be between 0 and 30. Please enter a valid mark.");
                
            }
           }
    //Display the entered marks
    
    System.out.println("Entered marks for students: ");
    for (int i = 0; i < 30; i++){
        System.out.println("Student " + (i + 1) + " : " + marks[i]);
        
    }
    
}
}
       
       
       
       
      
       
       
  // }
//}
