import java.util.Scanner;
 
public class ParkingSystem {
 
    int TOTAL_SLOTS = 20;
    int SLOT_EMPTY = 0;
    int SLOT_OCCUPIED = 1;
    int LOT_FULL = -1;
 
    
   public static int[] parkingLot = new int[TOTAL_SLOTS];
 
 
    public static void initialiseLot() {
        
        for (int slotIndex = 0; slotIndex < TOTAL_SLOTS; slotIndex++) {
            
            parkingLot[slotIndex] = SLOT_EMPTY;
        }
    }
 
    
   public static int parkCarAuto() {
        for (int slotIndex = 0; slotIndex < TOTAL_SLOTS; slotIndex++) {
            if (parkingLot[slotIndex] == SLOT_EMPTY) {
                parkingLot[slotIndex] = SLOT_OCCUPIED;
                int assignedSlotNumber = slotIndex + 1;  
                return assignedSlotNumber;
            }
        }
        return LOT_FULL;  
    }
 
   
   
  public static String parkCarSpecific(int chosenSlotNumber) {
        
        boolean slotNumberIsOutOfRange = chosenSlotNumber < 1 || chosenSlotNumber > TOTAL_SLOTS;
        
        if (slotNumberIsOutOfRange) {
            
            return "invalid";
        }
 
        int arrayIndex = chosenSlotNumber - 1;  
 
        boolean slotIsAlreadyTaken = parkingLot[arrayIndex] == SLOT_OCCUPIED;
       
        if (slotIsAlreadyTaken) {
           
            return "occupied";
        }
 
        parkingLot[arrayIndex] = SLOT_OCCUPIED;
        return "success";
    }
 
   
   
   public static String removeCar(int chosenSlotNumber) {
        boolean slotNumberIsOutOfRange = chosenSlotNumber < 1 || chosenSlotNumber > TOTAL_SLOTS;
        if (slotNumberIsOutOfRange) {
            return "invalid";
        }
 
        int arrayIndex = chosenSlotNumber - 1;  
 
        boolean slotIsAlreadyEmpty = parkingLot[arrayIndex] == SLOT_EMPTY;
        if (slotIsAlreadyEmpty) {
            return "empty";
        }
 
        parkingLot[arrayIndex] = SLOT_EMPTY;
        return "success";
    }
 
    
   public static int countOccupied() {
        int numberOfOccupiedSlots = 0;
        for (int slotIndex = 0; slotIndex < TOTAL_SLOTS; slotIndex++) {
            if (parkingLot[slotIndex] == SLOT_OCCUPIED) {
                numberOfOccupiedSlots++;
            }
        }
        return numberOfOccupiedSlots;
    }
 
   
   public static int countAvailable() {
        int numberOfAvailableSlots = TOTAL_SLOTS - countOccupied();
        return numberOfAvailableSlots;
    }
        }
 
  
    
