package company.abstracts;

import company.interfaces.Employable;


public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String position;
    private String hireDate;


    public Employee(String name, double salary, int id, String position, String hireDate) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.position = position;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
8
    public String getPosition() {
        return position;
    }

    public String getHireDate() {
        return hireDate;
    }
    public int hashCode() {
        return Integer.hashCode(id);
    }

}
