

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;


        
        public class TestWarmUpTask {

    @Test
    
    public void testForDuplicate (){
    
    int actual = WarmUpTask.getTheDuplicate({1,2,2,3,4})
    
    int expected = ({1,3,4});
    
    assertArrayEquals(actual, expected);
    
    
    }

}
