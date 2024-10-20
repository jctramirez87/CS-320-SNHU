package contactservice;

//Contact class representing a contact entity with fields like contactID, firstName, lastName, phone, and address.
public class Contact {
	private final String contactID;  // Unique ID for each contact (not updatable)
    private String firstName;        // Contact's first name
    private String lastName;         // Contact's last name
    private String phone;            // Contact's phone number (must be exactly 10 digits)
    private String address;          // Contact's address (must not exceed 30 characters)

 // Constructor for the Contact object with validation for each field.
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
    	// Validate contact ID: non-null and max length of 10 characters.
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        // Validate first name: non-null and max length of 10 characters.
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        // Validate last name: non-null and max length of 10 characters.
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        // Validate phone number: must be non-null, exactly 10 digits, and numeric.
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        // Validate address: non-null and max length of 30 characters.
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactID = contactID; // Initialize contactID (final and not updatable)
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    
    // Getter for contactID (final, cannot be changed)
    public String getContactID() {
        return contactID;
    }

    // Getter and setter for firstName with validation on setting.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Getter and setter for lastName with validation on setting.
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Getter and setter for phone with validation on setting.
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    // Getter and setter for address with validation on setting.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
