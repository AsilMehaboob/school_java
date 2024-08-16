import java.util.Scanner;


class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor to initialize Employee details
    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to print employee details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

// Define the Officer class that inherits from Employee
class Officer extends Employee {
    String specialization;

    // Constructor to initialize Officer details
    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print the officer specialization
    void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

// Define the Manager class that inherits from Employee
class Manager extends Employee {
    String department;

    // Constructor to initialize Manager details
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print the manager department
    void printDepartment() {
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for Officer
        System.out.println("Enter Officer Details:");
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Age: ");
        int officerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Phone Number: ");
        String officerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String officerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double officerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Specialization: ");
        String officerSpecialization = scanner.nextLine();

        Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, officerSalary, officerSpecialization);

        // Input details for Manager
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);

        // Print the details
        System.out.println();
        officer.printDetails();
        officer.printSpecialization();
        officer.printSalary();

        System.out.println();
        manager.printDetails();
        manager.printDepartment();
        manager.printSalary();

        scanner.close();
    }
}
