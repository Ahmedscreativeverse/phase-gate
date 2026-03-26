




import java.util.Scanner;

public class TaskFour {

public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);

        
    System.out.print("Enter a number: ");
    int number = input.nextInt();
      
      
    for (int value= 1; value <= 12; value++) {
          
          
          
            System.out.println(number + " x " + value + " = " + (number * value));
        }

       
    }
}
