package company.abstracts;

import company.interfaces.Employable;

import javax.management.ObjectInstance;


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

    public String getPosition() {
        return position;
    }

    public String getHireDate() {
        return hireDate;
    }
    public int hashCode() {
        return Integer.hashCode(id);
    }
 //   public boolean equals(Object obj){
//        return(obj.equals(null)|| this != obj?false:(this==obj||obj.hashCode()==this.hashCode()?true:false);

    //    Employee employee = (Employee) obj;
      //  return this.id == employee.id;

public boolean equals(Object obj) {
    if (obj==null||this != obj) {
        return false;
    }else return true;
}

}
