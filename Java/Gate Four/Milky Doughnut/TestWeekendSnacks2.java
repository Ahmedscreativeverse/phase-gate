


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



    public class TestWeekendSnacks2 {
    
    @Test
    
    public void getTheIndexOfThefifthNumber() {
    
    int actual = WeekendSnacksMethod.linearSearch(new int [] {1,2,3,4,5,}, 5);
    
    int expected = 4;
    
    assertEquals(expected, actual);
    
  }  
    
    
    
    @Test
    
    public void testForValueOutOfBound (){
    
    int actual = WeekendSnacksMethod.linearSearch(new int [] {1,2,3}, 4);
    
    int expected = -1;
    
    assertEquals(expected, actual);
    
    
        }
    }
