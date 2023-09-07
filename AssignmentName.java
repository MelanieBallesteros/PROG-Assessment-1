
/**
 * Write a description of class StudentStatisticsMarks here.
 *
 * @author (Melanie Ballesteros)
 * @version (a version number or a date)
 */

import java.util.Scanner;

//public class StudentStatisticsMarks
//{
    public class AssignmentName{
        
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the assignment name: ");
            String assignmentName = scanner.nextLine();
            System.out.println("You entered: " + assignmentName);
            scanner.close();
        }
    }
    
//}
