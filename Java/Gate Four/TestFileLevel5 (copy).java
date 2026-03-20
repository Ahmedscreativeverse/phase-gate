





import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


                //1
public class TestFileLevel5 {

//    @Test
//       
//   
//    public void testGetPrimes() {
//       
//       
//        int[] actual = MethodsLevelFive.getPrimes{5, 9, 3, 6, 2};
//       
//        int[] expected = {2, 3, 5};
//
//        assertArrayEquals(expected, actual);
//    }
//}
    
    
    


                    //2
    @Test
    
   

    
    public void testReplaceNegatives() {
        int[] actual = MethodsLevelFive2.replaceNegativesWithZero{5, -9, 3, -6, 2, -11};
        int[] expected = {5, 0, 3, 0, 2, 0};
        
        assertArrayEquals(expected, actual);
    }
}
