
/**
 * Write a description of class StudentStatisticsMarks here.
 *
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
            
                   
        //Check if the input is a valid mark (between 0 and 30) else error message and ask to enter valid mark  
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
     
    //Method to display results
     public void DisplayHighestLowestMark(){
     
         double lowestMark = findLowestMark();
         double highestMark = findHighestMark();
         
         System.out.println("Lowest Mark: " + lowestMark);
         System.out.println("Highest Mark: " + highestMark);
         
      
     
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
         //double sum = 0.0;
         //Calculate the mean
         int totalMarks = 0;
         //double mean = sum / 30; //Calculate the mean
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
     
         //Print the mean standard deviation
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
     }
    }
    
        
        
    
//    public void StudentMarks(){       
        
//        for (int i = 0; i < 30; i++){
//            int studentNumber = i +1;
//            int mark = getInput(studentNumber);
//            marks[i] = mark;
//        }
        
        
        //Display the entered marks
//        System.out.println("Entered marks for 30 students ");  
//        for (int i = 0; i<30; i++){
//            int studentNumber = i + 1;
//            int mark = marks[i];
//            System.out.println("Student " + studentNumber + " : " + mark);
//          }
                   
          
//        }
        
        
        //Input student marks
//        public static int getInput(int studentNumber){
//            Scanner scanner = new Scanner(System.in);
//            int mark;            
            
           // for(int i = 1; i <= 30; i++){
//            System.out.print("Enter mark for Student " + studentNumber + " : ");
//            mark=scanner.nextInt();
         
            //Display error message when invalid mark entered
//            if(mark < 0 || mark > 30){
//                System.out.println("Invalid mark input! Mark must be between 0 and 30. Please enter a valid mark for Student " + studentNumber + " : ");
//                mark=getInput(studentNumber); // Recurring call the method to re-enter a mark
//            }
//            return mark;           
//        }
        //Method to find the lowest price
        
//        public double
        
        
        
        
//    }
      
        
      





     
        
        
    
    
        
        
   