
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGER =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    contacts.add(new Contact(name, phone));
                    System.out.println("Contact added!");
                    break;

                case 2:
                    for (Contact c : contacts) {
                        System.out.println(c.name + " - " + c.phone);
                    }
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(search)) {
                            System.out.println(c.name + " - " + c.phone);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String delete = sc.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equalsIgnoreCase(delete)) {
                            contacts.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Contact deleted!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
