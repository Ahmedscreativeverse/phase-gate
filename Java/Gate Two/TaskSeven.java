

import java.util.Scanner;

public class TaskSeven {
   
   
    public static void main(String[] args) {
   
   
        Scanner input = new Scanner(System.in);
        
        
        int sum = 0;

        
        for (int value = 1; value <= 5; value++) {
        
            System.out.print("Enter five number: ");
           
            int number = input.nextInt();
           
           
            sum += number;
        }

        
        System.out.println("The sum of numbers entered is: " + sum);

        
    }
}

