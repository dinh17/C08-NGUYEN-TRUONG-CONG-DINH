package FuramaResort.services;

import FuramaResort.models.person.Employee;

public interface EmployeeService extends Service<Employee>{
    int searchInfo(int employeeId);
    void deleteInformation(int id, boolean choice);
}
