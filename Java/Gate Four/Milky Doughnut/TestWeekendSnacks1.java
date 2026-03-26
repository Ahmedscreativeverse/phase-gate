



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



    public class TestWeekendSnacks1 {
    
    
    
    @Test
    
    public void testCountEvensWithMixedNumbers(){
    
    int actual = WeekendSnacksMethod.countEvens(new int[] {1,2,3,4,5,6,7,8,9,10});
    
    int expected = 5;
    
    assertEquals(expected, actual);
   
    
         }
    
    
    @Test
    public void testWithAllEvenNumbers() {
    
    int actual = WeekendSnacksMethod.countEvens(new int[] {2,4,6,8,10});
    
    int expected = 5;
    
    assertEquals(expected, actual);  
    }
    
    @Test
    
    public void testWithOddNumbers(){
    
    int actual = WeekendSnacksMethod.countEvens(new int [] {1, 3, 5, 7, 9, 11});
    
    int expected = 0;
    
    assertEquals(expected, actual);
    
    
    }
    
    
    
    }
