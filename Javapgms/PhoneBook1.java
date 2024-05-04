import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, new Contact(name, phoneNumber));
        System.out.println("Contact added: " + name);
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Contact found:");
            System.out.println(contacts.get(name));
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    phoneBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    name = scanner.nextLine();
                    phoneBook.searchContact(name);
                    break;
                case 4:
                    System.out.print("Enter contact name to delete: ");
                    name = scanner.nextLine();
                    phoneBook.deleteContact(name);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Exiting Phone Book...");
        scanner.close();
    }
}
