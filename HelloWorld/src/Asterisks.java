/*
Student Name: Prakash Acharya
Course: Software Engineering
Instructor: Courtney Brown
Date: 2020-08-28
File Name: Asterisks.java
*/

// prints number of asteriks specified by the user
import java.util.Scanner;
public class Asterisks{
   
   public static void main(String[] args){
      int num;
      String response;
      Scanner scan = new Scanner(System.in);
      
      while(true){
         System.out.print("Please enter a number to specify how many asteriks you want to print:");
         num = scan.nextInt();
      
         for(int i=0;i<num;i++){
            System.out.println("*");
         }
         
         System.out.println("Do you want to start over?\nEnter 'n' to terminate");
         response = scan.nextLine();
         if(response == "n" || response == "N"){
            break;
         }         
      }
   }
}
