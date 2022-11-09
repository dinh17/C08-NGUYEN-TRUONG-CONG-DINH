package FuramaResort.services.impl;

import FuramaResort.models.person.Employee;
import FuramaResort.services.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    static ArrayList<Employee> employeeList = new ArrayList<>();



    public static void addInformation(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void deleteInformation(int employeeId, boolean choice) {
        int index = this.searchInfo(employeeId);
        if (choice) {
            employeeList.remove(employeeList.get(index));
        }
    }


    public Employee getEmployeeInfo(int index) {
        return employeeList.get(index);
    }

    @Override
    public int searchInfo(int employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == employeeId) {
                return i;
            }
        }
        return -1;
    }

    //    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

}
