package org.example.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee developer = employeeFactory.getEmployee("Developer");
        developer.doWork();

        Employee po = employeeFactory.getEmployee("PO");
        po.doWork();

    }

}
