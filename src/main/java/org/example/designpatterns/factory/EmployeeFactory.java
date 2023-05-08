package org.example.designpatterns.factory;

public class EmployeeFactory {

    public Employee getEmployee(String employeeType) {
        if (employeeType == null) {
            return null;
        } else if (employeeType.equalsIgnoreCase("developer")) {
            return new Developer();
        } else if (employeeType.equalsIgnoreCase("Business Analyst")) {
            return new BusinessAnalyst();
        } else if (employeeType.equalsIgnoreCase("PO")) {
            return new PO();
        }
        return null;
    }

}
