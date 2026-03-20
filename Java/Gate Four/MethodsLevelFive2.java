





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

      
