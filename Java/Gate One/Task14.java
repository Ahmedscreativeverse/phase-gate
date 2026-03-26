import java.util.Scanner;

    public class Task14 {
    
    public static void main (String[] args){ 
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number: ");
    int number1 = input.nextInt();
    
      System.out.println("Enter second number: ");
    int number2 = input.nextInt();
    
    
    if (number1 > number2 ){
    System.out.println("The highest number is the first number: " + number1);
    
    }
    if (number2 > number1){
       System.out.println("The highest number is second number: " + number2);
    }
    
    }
    }
