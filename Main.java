import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker w1=new Worker("Zenek",3500,1,"CNC","22.03.21");
        Worker w2=new Worker("Jacek",3300,2,"CNC","22.03.11");
        Worker w3=new Worker("Franek",5000,3,"CNC","22.03.17");
        Worker w4=new Worker("Jan",1200,4,"SimpleGuy","12.01.22");
        Manager m1=new Manager("Jesper",15000,5,"BigBoss","23.03.14");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(w1);
        employees.add(w2);
        employees.add(w3);
        employees.add(w4);
        employees.add(m1);

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).work();
            System.out.println( employees.get(i).getName ()+" ID:" +employees.get(i).hashCode()+" Position: "+
        employees.get(i).getPosition()+", Hire date: "+employees.get(i).getHireDate()+", Salary: "+employees.get(i).getSalary());
        }

    }
}