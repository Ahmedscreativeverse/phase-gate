
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



    public class TestWeekendSnacks4 {
    
    
    @Test
    
    
    public void testForTheSameLength (){
    
    boolean actual = WeekendSnacksMethod.arraysEquals(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10});
    
    boolean expected = true;
    
    assertEquals(actual, expected);
    }
    }
   
    
    
   @Test
   
   public void testForDifferentLength() {
   
   boolean actual = WeekendSnacksMethod.arraysEquals(new int[]{2,4,6,8,10}, new int[]{2,4,6});
   
   boolean expected = false;
   
   assertEquals(actual, expected);
   
   
   }
   
