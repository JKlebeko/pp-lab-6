package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {


    public Manager(String name, double salary, int id, String position, String hireDate) {
        super(name, salary, id, position, hireDate);
    }

    @Override
    public void work() {
        System.out.println("Manager "+getName()+ " is managing...");
    }
}
