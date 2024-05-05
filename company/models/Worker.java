package company.models;

import company.abstracts.Employee;

public class Worker extends Employee {


    public Worker(String name, double salary, int id, String position, String hireDate) {
        super(name, salary, id, position, hireDate);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}
