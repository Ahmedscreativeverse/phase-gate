

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProblemTest {

    @Test
    public void testForTheOutput() {

        int[] actual = Problem.getTheOutputOfTheThreeInput(10, 11, 12, 5);
        
        
        int[] expected = {10, 11, 12, -1, -1};

        assertArrayEquals(expected, actual);   
        
    }
}


//  @Test
//  
//  public void testForTheOutPutWhenWeHaveFiveInput() {
//  
//  int [] actual = Problem.getTheOutputWhenWeHaveFiveInput(10, 11, 12, 13,14, 2);
//  
//  int[] expexted = {10,11};
//  
//  assertArrayEquals(expected, actual);   
//  
//  }
