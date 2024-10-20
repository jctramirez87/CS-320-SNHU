package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import contactservice.Contact;
import contactservice.ContactService;

//Unit tests for the ContactService class.
public class ContactServiceTest {

    private ContactService service; // ContactService instance to be tested.

    // Initialize the service before each test.
    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    // Test adding a contact and ensuring no exceptions are thrown during updates.
    @Test
    public void testAddContactSuccess() {
        // Create and add a valid contact.
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Elm Street");
        service.addContact(contact);

        // Ensure that updating the contact does not throw exceptions.
        assertDoesNotThrow(() -> service.updateFirstName("1234567890", "Jane"));
    }

    // Test deleting a contact and ensuring it no longer exists.
    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Elm Street");
        service.addContact(contact);
        service.deleteContact("1234567890");

        // Verify that updating the deleted contact throws an exception.
        assertThrows(IllegalArgumentException.class, () -> service.updateFirstName("1234567890", "Jane"));
    }


    // Test updating contact details (first name and phone).
    @Test
    public void testUpdateContactDetails() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Elm Street");
        service.addContact(contact);
        
        // Update first name and verify.
        service.updateFirstName("1234567890", "Jane");
        assertEquals("Jane", contact.getFirstName());
        
        // Update phone number and verify.
        service.updatePhone("1234567890", "0987654321");
        assertEquals("0987654321", contact.getPhone());
    }
}
