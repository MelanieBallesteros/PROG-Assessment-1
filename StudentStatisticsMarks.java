
/**
 * Write a description of class StudentStatisticsMarks here.
 *
 * @author (Melanie Ballesteros)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class StudentStatisticsMarks
{
     //double[] studentMarks = new double[30];
    
    public void AssignmentName(){
       // public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Please enter the assignment name: ");
            String assignmentName = scanner.nextLine();
            System.out.println("Assignment Name entered is: " + assignmentName);
            scanner.close();
        }
 
    
    public void StudentMarks(){
        int[]marks = new int[30]; //array to store marks
        
        for (int i = 0; i < 30; i++){
            int studentNumber = i +1;
            int mark = getInput(studentNumber);
            marks[i] = mark;
        }
        
        System.out.println("Entered marks for 30 students: ");  //Display the entered marks
        for (int i = 0; i<30; i++){
            int studentNumber = i + 1;
            int mark = marks[i];
            System.out.println("Student " + studentNumber + " : " + mark);
          }
        }
        
        public static int getInput(int studentNumber){
            Scanner scanner = new Scanner(System.in);
            int mark;
            
            System.out.print("Enter mark for Student " + studentNumber + " : ");
            mark=scanner.nextInt();
            
            if(mark < 0 || mark > 30){
                System.out.println("Invalid mark input! Mark must be between 0 and 30. Please enter a valid mark for Student " + studentNumber + " : ");
                mark=getInput(studentNumber); // Recurring call the method to re-enter a mark
            }
            
            return mark;
            
        }
    }
       
  
        
    

