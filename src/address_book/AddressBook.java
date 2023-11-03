package address_book;

 class AddressBook {

    private Contact[] contacts;
    private int numContacts;

    public AddressBook(int maxSize) {
        contacts = new Contact[maxSize];
        numContacts = 0;
    }

    public void addContact(Contact contact) {
        if (numContacts < contacts.length) {
            contacts[numContacts] = contact;
            numContacts++;
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Address book is full. Cannot add more contacts.");
        }
    }

    public Contact findContact(String firstName) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].firstName.equalsIgnoreCase(firstName)) {
                return contacts[i];
            }
        }
        return null;
    }
}

