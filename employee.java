// Define the Employee class
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
}

// Define the Officer class that contains an Employee instance
class Officer {
    Employee employee;
    String specialization;

    // Constructor to initialize Officer details
    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.employee = new Employee(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print the officer details and salary
    void printDetails() {
        System.out.println("Officer Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + specialization);
        employee.printSalary();
    }
}

// Define the Manager class that contains an Employee instance
class Manager {
    Employee employee;
    String department;

    // Constructor to initialize Manager details
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.employee = new Employee(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print the manager details and salary
    void printDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Department: " + department);
        employee.printSalary();
    }
}

// Main class to test the implementation
public class employee {
    public static void main(String[] args) {
        // Create an Officer object and assign values
        Officer officer = new Officer("John Doe", 35, "123-456-7890", "123 Main St", 50000, "Security");

        // Create a Manager object and assign values
        Manager manager = new Manager("Jane Smith", 40, "987-654-3210", "456 Elm St", 75000, "HR");

        // Print the details
        officer.printDetails();
        System.out.println();
        manager.printDetails();
    }
}
