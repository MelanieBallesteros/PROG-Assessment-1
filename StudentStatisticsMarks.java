
/**
 * Write a description of class StudentStatisticsMarks here.
 *
 * @author (Melanie Ballesteros)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class StudentStatisticsMarks
{
      int[]marks = new int[30]; //array to store marks
      double[] studentMarks = new double[30];
      double highestMark = 0;    //Initialize to a low value
      double lowestMark = 30;    // Initialize to a high value
      //private int mark;
      //int highestMark = marks[0];
      //int lowestMark = marks[0];
      //int[]mark = new int[studMarks];
    
     //double[] studentMarks = new double[30];
    
     //Input assignment name
    public void AssignmentName(){
       // public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);            
            System.out.print("Please enter the assignment name: ");
            String assignmentName = scanner.nextLine();
            System.out.println("Assignment Name entered is: " + assignmentName);
            scanner.close();
        }
 
    
    public void StudentMarks(){
       
        
        for (int i = 0; i < 30; i++){
            int studentNumber = i +1;
            int mark = getInput(studentNumber);
            marks[i] = mark;
        }
        
        //Display the entered marks
        System.out.println("Entered marks for 30 students ");  
        for (int i = 0; i<30; i++){
            int studentNumber = i + 1;
            int mark = marks[i];
            System.out.println("Student " + studentNumber + " : " + mark);
          }
        }
        
        //Input student marks
        public static int getInput(int studentNumber){
            Scanner scanner = new Scanner(System.in);
            int mark;            
            
           // for(int i = 1; i <= 30; i++){
            System.out.print("Enter mark for Student " + studentNumber + " : ");
            mark=scanner.nextInt();
         
            //Display error message when invalid mark entered
            if(mark < 0 || mark > 30){
                System.out.println("Invalid mark input! Mark must be between 0 and 30. Please enter a valid mark for Student " + studentNumber + " : ");
                mark=getInput(studentNumber); // Recurring call the method to re-enter a mark
            }
            return mark;           
            
        }
        
        public double findHighestMark(){
            double highestMark = this.studentMarks[0];
            
            for (double mark : this.studentMarks){
            if (mark > highestMark){
                highestMark = mark;
            }
            }
            return highestMark;
        }
        
        public double findLowestMark(){
            double lowestMark = this.studentMarks[0];
            
            for (double mark : this.studentMarks){
            if (mark < lowestMark){
                lowestMark = mark;
            }
        
        }
        
        return lowestMark;
    }
}
        //Print the highest and lowest marks
        
        //System.out.println("The highest mark is: " + highestMark);
      //  System.out.println("The lowest mark is : " + lowestMark);
        
      //  scanner.close();
        
   // }
//}
        
        
        //public int findHighestMark(){
          //  int mark;
            //mark = 0;
            //int highestMark = Integer.MIN_VALUE;
                                    
             
            //for (int i = 0; i < mark; i++){
            //if (marks[i] > highestMark) {
              //  highestMark = marks[i];
            //}
        //}
        //return highestMark;
    //}
        
      //  public int findLowestMark(){
        //    int mark;
          //  mark = 0;
         //   int lowestMark = Integer.MAX_VALUE;
          //  for (int i = 0; i < mark; i++) {
          //      if(marks[i] < lowestMark){
          //          lowestMark = marks[i];
           //     }
        //    }
        //    return lowestMark;
       // }
        
     //   public void printHighestAndLowestMarks(){
      //      int highest = findHighestMark();
       //     int lowest = findLowestMark();
        //    System.out.println("Highest Mark: " + highest);
        //    System.out.println("Lowest Mark: " + lowest);
            
    //    }
                 
      
      //  }
    
        
    
        
        
        
        
        
        
    
       
  
        
    

