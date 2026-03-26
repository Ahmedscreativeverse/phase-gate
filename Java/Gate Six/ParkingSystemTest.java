

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ParkingSystemTest {

    
    

    @Test
    void testInitialiseLot() {
        assertEquals(20, ParkingSystem.countAvailable());
        assertEquals(0, ParkingSystem.countOccupied());
    }

    @Test
    void testParkCarAuto() {
        int slot = ParkingSystem.parkCarAuto();
        assertEquals(1, slot);
        assertEquals(1, ParkingSystem.countOccupied());
    }

    

    @Test
    void testParkCarSpecificSuccess() {
        String result = ParkingSystem.parkCarSpecific(5);
        assertEquals("success", result);
    }

    @Test
    void testParkCarSpecificInvalid() {
        assertEquals("invalid", ParkingSystem.parkCarSpecific(0));
        assertEquals("invalid", ParkingSystem.parkCarSpecific(21));
    }

    @Test
    void testParkCarSpecificOccupied() {
        ParkingSystem.parkCarSpecific(3);
        assertEquals("occupied", ParkingSystem.parkCarSpecific(3));
    }

    @Test
    void testRemoveCarSuccess() {
        ParkingSystem.parkCarSpecific(4);
        assertEquals("success", ParkingSystem.removeCar(4));
    }

    @Test
    void testRemoveCarEmpty() {
        assertEquals("empty", ParkingSystem.removeCar(2));
    }

    @Test
    void testRemoveCarInvalid() {
        assertEquals("invalid", ParkingSystem.removeCar(25));
    }

    @Test
    void testCounts() {
        ParkingSystem.parkCarSpecific(1);
        ParkingSystem.parkCarSpecific(2);

        assertEquals(2, ParkingSystem.countOccupied());
        assertEquals(18, ParkingSystem.countAvailable());
    }
}
