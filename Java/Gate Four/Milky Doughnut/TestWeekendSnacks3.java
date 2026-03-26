


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



    public class TestWeekendSnacks3 {
    
    @Test
    
    
  public void testSquaresWithFour() {
  
  int [] actual = WeekendSnacksMethod.squares(4);
  
  int [] expected = {1,4,9,16};
   
   
   assertArrayEquals(actual,expected);
  }
  
    
    
    @Test
    
    public void testWithOne(){
    
    
    int[] actual = WeekendSnacksMethod.squares(1);
    
    int [] expected = {1};
    
    assertArrayEquals(actual, expected);
    
    }
    }
