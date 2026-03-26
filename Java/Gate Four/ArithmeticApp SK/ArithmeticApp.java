
//pseudocode
//1. Generate random numbers using the java inbuilt method 
//2. The random numbers generated now will be used to prompt users for the arithmetic questions.
//3  The while loop is used to keep the question going (iteration)
//4. The if and alse statement is used to tell when the user is right or wrong 


import java.util.Scanner;

public class ArithmeticApp {

public static void main(String[] args){

int numberOfQuestionsToAsk=10;

int count=0;


Scanner input = new Scanner(System.in);

while (count < numberOfQuestionsToAsk) {


int number1 = (int)(Math.random() * 50);
int number2 = (int)(Math.random() * 50);



    System.out.println("What is " + number1 + " – " + number2 );
        int result = input.nextInt();

    if (number1 - number2 != result){
    System.out.println("That is wrong");
    
    }else{
    
    
System.out.println("That is right");
    }
    }
    }
    }
    
    
