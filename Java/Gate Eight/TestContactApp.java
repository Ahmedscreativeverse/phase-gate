
 
 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContactApp {

    @Test
    void addingOneContact_shouldIncreaseTotalContactsToOne() {
        ContactApp.contactNames[0] = "Gbasa";
        ContactApp.contactPhones[0] = "08012345678";
        ContactApp.totalContacts++;
        assertEquals(1, ContactApp.totalContacts);
    }
}
