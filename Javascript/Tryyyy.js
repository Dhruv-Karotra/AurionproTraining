class User {
    constructor(id, username, role) {
      this.id = id;
      this.username = username;
      this.role = role;
    }
  
    // Method to create a user (for Admin only)
    static createUser(username, role) {
      if (loggedInUser && loggedInUser.role === 'Admin') {
        const id = generateId(); // Function to generate a unique ID
        const newUser = new User(id, username, role);
        users.push(newUser);
        return newUser;
      } else {
        throw new Error('Only Admin can create users.');
      }
    }
  
    // Method to read a user
    static readUser(userId) {
      if (loggedInUser) {
        return users.find((user) => user.id === userId);
      } else {
        throw new Error('You need to be logged in to perform this action.');
      }
    }
  
    // Method to update a user (for Admin only)
    static updateUser(userId, username, role) {
      if (loggedInUser && loggedInUser.role === 'Admin') {
        const userToUpdate = users.find((user) => user.id === userId);
        if (userToUpdate) {
          userToUpdate.username = username;
          userToUpdate.role = role;
          return userToUpdate;
        } else {
          throw new Error('User not found.');
        }
      } else {
        throw new Error('Only Admin can update users.');
      }
    }
  
    // Method to delete a user (for Admin only)
    static deleteUser(userId) {
      if (loggedInUser && loggedInUser.role === 'Admin') {
        const index = users.findIndex((user) => user.id === userId);
        if (index !== -1) {
          users.splice(index, 1);
        } else {
          throw new Error('User not found.');
        }
      } else {
        throw new Error('Only Admin can delete users.');
      }
    }
  }
  
  class Contact {
    constructor(id, firstName, lastName, email, phone) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.phone = phone;
    }
  
    // Method to create a contact (for Staff only)
    static createContact(firstName, lastName, email, phone) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const id = generateId(); // Function to generate a unique ID
        const newContact = new Contact(id, firstName, lastName, email, phone);
        contacts.push(newContact);
        return newContact;
      } else {
        throw new Error('Only Staff can create contacts.');
      }
    }
  
    // Method to read a contact
    static readContact(contactId) {
      if (loggedInUser) {
        return contacts.find((contact) => contact.id === contactId);
      } else {
        throw new Error('You need to be logged in to perform this action.');
      }
    }
  
    // Method to update a contact (for Staff only)
    static updateContact(contactId, firstName, lastName, email, phone) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const contactToUpdate = contacts.find((contact) => contact.id === contactId);
        if (contactToUpdate) {
          contactToUpdate.firstName = firstName;
          contactToUpdate.lastName = lastName;
          contactToUpdate.email = email;
          contactToUpdate.phone = phone;
          return contactToUpdate;
        } else {
          throw new Error('Contact not found.');
        }
      } else {
        throw new Error('Only Staff can update contacts.');
      }
    }
  
    // Method to delete a contact (for Staff only)
    static deleteContact(contactId) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const index = contacts.findIndex((contact) => contact.id === contactId);
        if (index !== -1) {
          contacts.splice(index, 1);
        } else {
          throw new Error('Contact not found.');
        }
      } else {
        throw new Error('Only Staff can delete contacts.');
      }
    }
  }
  
  class ContactDetails {
    constructor(id, contactId, address, city, country) {
      this.id = id;
      this.contactId = contactId;
      this.address = address;
      this.city = city;
      this.country = country;
    }
  
    // Method to create contact details (for Staff only)
    static createContactDetails(contactId, address, city, country) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const id = generateId(); // Function to generate a unique ID
        const newContactDetails = new ContactDetails(id, contactId, address, city, country);
        contactDetails.push(newContactDetails);
        return newContactDetails;
      } else {
        throw new Error('Only Staff can create contact details.');
      }
    }
  
    // Method to read contact details
    static readContactDetails(contactDetailsId) {
      if (loggedInUser) {
        return contactDetails.find((details) => details.id === contactDetailsId);
      } else {
        throw new Error('You need to be logged in to perform this action.');
      }
    }
  
    // Method to update contact details (for Staff only)
    static updateContactDetails(contactDetailsId, address, city, country) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const contactDetailsToUpdate = contactDetails.find(
          (details) => details.id === contactDetailsId
        );
        if (contactDetailsToUpdate) {
          contactDetailsToUpdate.address = address;
          contactDetailsToUpdate.city = city;
          contactDetailsToUpdate.country = country;
          return contactDetailsToUpdate;
        } else {
          throw new Error('Contact details not found.');
        }
      } else {
        throw new Error('Only Staff can update contact details.');
      }
    }
  
    // Method to delete contact details (for Staff only)
    static deleteContactDetails(contactDetailsId) {
      if (loggedInUser && loggedInUser.role === 'Staff') {
        const index = contactDetails.findIndex((details) => details.id === contactDetailsId);
        if (index !== -1) {
          contactDetails.splice(index, 1);
        } else {
          throw new Error('Contact details not found.');
        }
      } else {
        throw new Error('Only Staff can delete contact details.');
      }
    }
  }
  
  // Sample data
  let users = [
    { id: 1, username: 'admin1', role: 'Admin' },
    { id: 2, username: 'staff1', role: 'Staff' },
    { id: 3, username: 'admin2', role: 'Admin' },
  ];
  
  let contacts = [
    { id: 1, firstName: 'John', lastName: 'Doe', email: 'john@example.com', phone: '1234567890' },
    { id: 2, firstName: 'Jane', lastName: 'Smith', email: 'jane@example.com', phone: '9876543210' },
  ];
  
  let contactDetails = [
    { id: 1, contactId: 1, address: '123 Main St', city: 'Anytown', country: 'USA' },
    { id: 2, contactId: 2}]


    let loggedInUser = null;

// Function to simulate the login process
function login(username) {
  // Find the user with the provided username in the users array
  const user = users.find((user) => user.username === username);

  // If the user is found, set the loggedInUser to the user object
  if (user) {
    loggedInUser = user;
    console.log(`Logged in as ${user.username} (${user.role})`);
  } else {
    console.log(`User not found.`);
  }
}

// Example login usage
login('staff1'); // Logging in as the staff user
// Now the loggedInUser will hold the staff user details.

login('admin1'); // Logging in as the admin user
// Now the loggedInUser will hold the admin user details.

  