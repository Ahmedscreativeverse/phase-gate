


    
    public class Problem {

    public static int[] getTheOutputOfTheThreeInput (int value1, int value2, int value3, int size) {
    
    
    
        int[] result = int[size];
        
        

        int[] values = {value1, value2, value3};

        for (int index = 0; index < size; index++) {
        
        
            if (index < values.length) {
            
            
                result[index] = values[index];
                
                
            } else {
            
            
                result[index] = -1;
            }
        }

        return result;
    }
}
    
    
    
    
    
    
    



















