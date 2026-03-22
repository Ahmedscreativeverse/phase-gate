





import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


                //2
public class TestLevel5 {


  
    @Test
    
     public void testReplaceNegatives() {
        
        int[] actual = MethodsLevelFive2.replaceNegativesWithZero{5, -9, 3, -6, 2, -11};
        
        int[] expected = {5, 0, 3, 0, 2, 0};
        
        assertArrayEquals(expected, actual);
    }
}
