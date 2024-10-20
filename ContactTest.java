package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.Contact;

//Unit tests for the Contact class.
public class ContactTest {

    // Test for successful creation of a contact.
    @Test
    public void testContactCreationSuccess() {
        // Create a valid contact object.
        Contact contact = new Contact("1234567890", "Jessica", "Ramirez", "9564400380", "722 South K Street");
        
        // Verify each field using assertions.
        assertEquals("1234567890", contact.getContactID());
        assertEquals("Jessica", contact.getFirstName());
        assertEquals("Ramirez", contact.getLastName());
        assertEquals("9564400380", contact.getPhone());
        assertEquals("722 South K Street", contact.getAddress());
    }

    // Test for invalid contact ID (more than 10 characters).
    @Test
    public void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Jessica", "Ramirez", "9564400380", "722 South K Street");
        });
    }

    // Test for invalid phone number (not exactly 10 digits).
    @Test
    public void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jessica", "Ramirez", "903778", "722 South K Street");
        });
    }

    // Test for updating the first name.
    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1234567890", "Jessica", "Ramirez", "9564400380", "722 South K Street");
        contact.setFirstName("Jami");
        assertEquals("Jami", contact.getFirstName());
    }
}
