
import java.util.ArrayList;
import java.util.Scanner;

class Patient {

    int patientId;
    String name;
    int age;
    String disease;
    double bill;

    Patient(int patientId, String name, int age, String disease, double bill) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.bill = bill;
    }

    void displayPatient() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Bill: Rs. " + bill);
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter patient age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();

                    System.out.print("Enter bill amount: ");
                    double bill = sc.nextDouble();

                    if (id <= 0 || age <= 0 || age > 120 || bill < 0) {
                        System.out.println("Invalid patient details!");
                        break;
                    }

                    boolean exists = false;

                    for (Patient p : patients) {
                        if (p.patientId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Patient ID already exists!");
                    } else {
                        Patient patient = new Patient(id, name, age, disease, bill);
                        patients.add(patient);
                        System.out.println("Patient added successfully!");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patient records found!");
                    } else {
                        for (Patient p : patients) {
                            p.displayPatient();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter patient ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Patient p : patients) {
                        if (p.patientId == searchId) {
                            p.displayPatient();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter patient ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).patientId == deleteId) {
                            patients.remove(i);
                            deleted = true;
                            System.out.println("Patient deleted successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Hospital Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
