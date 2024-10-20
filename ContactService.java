package contactservice;

import java.util.HashMap;
import java.util.Map;


//ContactService class manages Contact objects in-memory (no database needed)
public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>(); // Map storing contacts by their unique ID.

    // Adds a new contact to the service.
    public void addContact(Contact contact) {
        // Ensure that the contact ID is unique.
        if (contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID must be unique");
        }
        contacts.put(contact.getContactID(), contact); // Add contact to the in-memory map.
    }

    // Deletes a contact by its ID.
    public void deleteContact(String contactID) {
        // Check if the contact exists before deletion.
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactID); // Remove the contact from the map.
    }

    // Updates the first name of a contact.
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = contacts.get(contactID);
        // Check if the contact exists before updating.
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setFirstName(newFirstName); // Update first name.
    }

    // Updates the last name of a contact.
    public void updateLastName(String contactID, String newLastName) {
        Contact contact = contacts.get(contactID);
        // Check if the contact exists before updating.
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setLastName(newLastName); // Update last name.
    }

    // Updates the phone number of a contact.
    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contacts.get(contactID);
        // Check if the contact exists before updating.
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setPhone(newPhone); // Update phone number.
    }

    // Updates the address of a contact.
    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contacts.get(contactID);
        // Check if the contact exists before updating.
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setAddress(newAddress); // Update address.
    }
}
