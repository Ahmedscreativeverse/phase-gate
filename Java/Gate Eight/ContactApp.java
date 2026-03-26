


import java.util.Scanner;

public class ContactApp {

    static String[] contactNames = new String[50];
    static String[] contactPhones = new String[50];
    
    static int totalContacts = 0;
    static Scanner userInput = new Scanner(System.in);

    static void addContact() {
        System.out.print("Enter name: ");
        String newContactName = userInput.nextLine();

        System.out.print("Enter phone: ");
        String newContactPhone = userInput.nextLine();

        contactNames[totalContacts] = newContactName;
        contactPhones[totalContacts] = newContactPhone;
        totalContacts++;

  
    }

    static void removeContact() {
       
        System.out.print("Enter phone to remove: ");
       
        String phoneToRemove = userInput.nextLine();

        for (int currentIndex = 0; currentIndex < totalContacts; currentIndex++) {
            if (contactPhones[currentIndex].equals(phoneToRemove)) {
               
                contactNames[currentIndex] = contactNames[totalContacts - 1];
               
                contactPhones[currentIndex] = contactPhones[totalContacts - 1];
               
                totalContacts--;
               
                return;
            }
        }

    }

   }
