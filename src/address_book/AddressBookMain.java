package address_book;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of contacts for the Address Book: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine();

        AddressBook addressBook = new AddressBook(maxSize);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter ZIP: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(newContact);
                    break;

                case 2:
                    System.out.print("Enter the First Name of the contact to edit: ");
                    String contactToEdit = scanner.nextLine();
                    Contact existingContact = addressBook.findContact(contactToEdit);

                    if (existingContact != null) {
                        System.out.print("Enter New First Name: ");
                        String newFirstName = scanner.nextLine();
                        System.out.print("Enter New Last Name: ");
                        String newLastName = scanner.nextLine();
                        System.out.print("Enter New Address: ");
                        String newAddress = scanner.nextLine();
                        System.out.print("Enter New City: ");
                        String newCity = scanner.nextLine();
                        System.out.print("Enter New State: ");
                        String newState = scanner.nextLine();
                        System.out.print("Enter New ZIP: ");
                        String newZip = scanner.nextLine();
                        System.out.print("Enter New Phone Number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Enter New Email: ");
                        String newEmail = scanner.nextLine();

                        existingContact.editContact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
                        System.out.println("Contact edited successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Address Book.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

