package FuramaResort.controllers;

import FuramaResort.models.person.EducationLevel;
import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.EducationLevelImpl;
import FuramaResort.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    private final Scanner scanner = new Scanner(System.in);
    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public  void displayMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");
            System.out.println("Enter your next choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.display();
                    break;
                case 2:
                    this.addEmployeeInfor();
                    break;
                case 3:
                    this.delete();
                    break;
                case 4:
                    this.edit();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private void addEmployeeInfor() {
        Employee employee = new Employee();
        System.out.println("Please fill the following information");
        System.out.println("ID");
        employee.setEmployeeId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Name");
        employee.setName(scanner.nextLine());
        System.out.println("Date of birth:");
        employee.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
        System.out.println("Gender");
        employee.setGender(scanner.nextLine());
        System.out.println("Citizen Identity Number");
        employee.setCitizenIdentityNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Phone number");
        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Email address:");
        employee.setEmail(scanner.nextLine());
        System.out.println("Salary:");
        employee.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println("Position");
        employee.setPosition(scanner.nextLine());
        System.out.println("Education level:");
        int choice;
        do {
            int i = 1;
            for (EducationLevel level : EducationLevelImpl.educationLevels) {
                System.out.println(i++ + " " + level.toString());
            }
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("Please enter valid level");
            }
        } while (choice > 4 || choice < 1);
        employee.setEducationLevel(EducationLevelImpl.educationLevels[choice - 1]);
        employeeService.addInformation(employee);
    }

    private void edit() {
        System.out.println("Enter ID of the employee that you want to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = employeeService.searchInfo(id);
        if (index != -1) {
            int choice;
            Employee employee = employeeService.getEmployeeInfo(index);
            do {
                System.out.println("1.\tEdit Name\n" +
                        "2.\tEdit date of birth\n" +
                        "3.\tEdit gender\n" +
                        "4.\tEdit citizen identity number\n" +
                        "5.\tEdit phone number\n" +
                        "6.\tEdit email address\n" +
                        "7.\tEdit salary\n" +
                        "8.\tEdit position\n" +
                        "9.\tEdit education level\n" +
                        "10.\tExit\n" +
                        "**Enter your choice:**");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 10|| choice < 1) {
                    System.out.println("!!!!!Please enter valid choice");
                }
                switch (choice) {
                    case 1:
                        System.out.println("New name:");
                        employee.setName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("New date of birth:");
                        employee.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("New gender");
                        employee.setGender(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("New Citizen Identity Number");
                        employee.setCitizenIdentityNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("New phone number");
                        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 6:
                        System.out.println("New email address:");
                        employee.setEmail(scanner.nextLine());
                        break;
                    case 7:
                        System.out.println("New salary:");
                        employee.setSalary(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 8:
                        System.out.println("New position");
                        employee.setPosition(scanner.nextLine());
                        break;
                    case 9:
                        System.out.println("New education level:");
                        int choice2;
                        do {
                            int i = 1;
                            for (EducationLevel level : EducationLevelImpl.educationLevels) {
                                System.out.println(i++ + " " + level.toString());
                            }
                            System.out.println("Enter your choice");
                            choice2 = Integer.parseInt(scanner.nextLine());
                            if (choice2 > 4 || choice2 < 1) {
                                System.out.println("Please enter valid level");
                            }
                        } while (choice2 > 4 || choice2 < 1);
                        employee.setEducationLevel(EducationLevelImpl.educationLevels[choice2 - 1]);
                        break;
                    case 10:
                        break;
                }
            } while (choice<10);
        }
    }

    private void delete() {
        System.out.println("Enter employee id to delete");
        int employeeId = Integer.parseInt(scanner.nextLine());
        if (employeeService.searchInfo(employeeId) != -1) {
            System.out.println("Are you sure that you want delete information of employee with id " + employeeId + "????\n" +
                    "1. Yes\n" +
                    "2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                employeeService.deleteInformation(employeeId, true);
            } else {
                return;
            }
        } else {
            System.out.println("Customer ID are not available, please enter a valid ID!!");
        }
    }

    private void display() {
        employeeService.display();
    }
}