



import java.util.Scanner;

    public class Task10 {
    
    public static void main (String[] args){ 
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number: ");
    int number1 = input.nextInt();
    
     System.out.println("Enter second number: ");
    int number2 = input.nextInt();
    
     System.out.println("Enter third number: ");
    int number3 = input.nextInt();
    
    int average = number1 + number2 + number3 / 3;
    
    System.out.println("The Average is: " + average);
    
    }
    }
