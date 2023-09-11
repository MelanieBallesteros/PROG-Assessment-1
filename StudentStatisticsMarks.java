
/**
 * Write a description of class StudentStatisticsMarks here.
 * A simple program to compute statistics of students' marks in an assignment that have functional methods
 * @author (Melanie Ballesteros)
 * @version (11 September 2023)
 */

import java.util.Scanner;

public class StudentStatisticsMarks
{
    double[]marks = new double[30]; //array to store marks
     
    
     // Input assignment name
    public void AssignmentName(){
            Scanner scanner = new Scanner(System.in);            
            System.out.print("Please enter the assignment name: ");
            String assignmentName = scanner.nextLine();
            System.out.println("Assignment Name entered is: " + assignmentName);
            scanner.close();
        }
    
    // Input student marks
    public void InputStudentMarks(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 30; i++){
            System.out.print("Enter mark for Student " + (i + 1) + " : ");
            double mark = scanner.nextDouble();
            
                   
        //Check if input is a valid mark (between 0 and 30) else error message and ask to enter valid mark  
        if (mark >= 0 && mark <= 30){
            marks[i] = mark;
        }
        
        else
        {
            System.out.println("Invalid mark! Please enter a valid mark between 0 and 30.");
                i--; // Decrement i to allow the user to re-enter the mark for the same student.
        }
        
    }
        
          //Display the entered marks         
         System.out.println("Entered marks for students " );
         for (int i = 0; i < 30; i++){
             System.out.println("Student " + (i +1)+ " : " + marks[i]);
             
         }
        }
     
    //Method to display results of highest and lowest marks
     public void DisplayHighestLowestMark(){
     
         double lowestMark = findLowestMark();
         double highestMark = findHighestMark();
         
         System.out.println("Lowest Mark is: " + lowestMark);
         System.out.println("Highest Mark is: " + highestMark);
         
          
        }
                       
        
     //Method to find the lowest mark     
     public double findLowestMark(){
         double lowestMark = marks[0];
         
         for (double marks : this.marks){
             if(marks < lowestMark){
             lowestMark = marks;
             }        
        }
        return lowestMark;
    }
       
    //Method to find the highest mark        
     public double findHighestMark(){ 
          double highestMark = marks[0];
          
          for(double marks : this.marks){
              if(marks > highestMark){
                  highestMark = marks;
              }             
          }
           return highestMark;
     }
        
     //Method to calculate the mean and Standard Deviation
     public void calculateMeanAndStandardDeviation(){                   
        
         //Calculate the mean
         int totalMarks = 0;
       
         for(int i = 0; i < 30; i++){
             totalMarks += marks[i];
         }
         
         double mean = (double) totalMarks / 30;
         
         
         //Calculate the sum of squared differences for standard deviation
         double sumOfSquaredDifferences = 0.0;
         for(int i = 0; i < 30; i++){
             double difference = marks[i] - mean;
             sumOfSquaredDifferences +=difference * difference;
             
         }
         
         //Calculate the standard deviation
         double standardDeviation = Math.sqrt(sumOfSquaredDifferences / 30);
     
         //Print the mean and standard deviation
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
     }
    
    }
    
        

        
      





     
        
        
    
    
        
        
   