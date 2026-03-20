


public class MethodsLevelFive {

    public static int[] getPrimes(int[] numbers) {
      
        int[] primeNumbers = new int[numbers.length]; 
      
        int count = 0; 

        
        for (int index = 0; index < numbers.length; index++) {
      
            int value = numbers[index]; 
      
      
            boolean isPrime = true;

            
            if (value <= 1) {
        
                isPrime = false;
            }

           
            for (int divisor = 2; divisor < value; divisor++) {
        
                if (value % divisor == 0) {
        
                    isPrime = false;
                }
            }

            
            if (isPrime) {
        
                primeNumbers[count] = value;
        
                count++;
            }
        }

       
        for (int currentIndex = 0; currentIndex < count; currentIndex++) {
 
            for (int nextIndex = currentIndex + 1; nextIndex < count; nextIndex++) {
 
                if (primeNumbers[currentIndex] > primeNumbers[nextIndex]) {
 
                    int temp = primeNumbers[currentIndex];
 
                    primeNumbers[currentIndex] = primeNumbers[nextIndex];
 
                    primeNumbers[nextIndex] = temp;
                }
            }
        }

        
        int[] exactPrimes = new int[count];
 
        for (int counter = 0; counter < count; counter++) {
 
            exactPrimes[counter] = primeNumbers[counter];
        }

      

        return exactPrimes;
    }
}

}

                    //2


public class MethodsLevelFive2 {

    public static int [] replaceNegativesWithZero(int [] scores) {
    
    for (int index = 0; index <scores.length; index++){
    
    int value = scores[index];
    
    if (value < 0) {
    
        scores[index] = 0;
        
        }
        }
        
        return scores;
        }
    
    }

      
