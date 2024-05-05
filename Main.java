import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker w1=new Worker("Zenek",3500,1);
        Worker w2=new Worker("Jacek",3300,2);
        Worker w3=new Worker("Franek",5000,3);
        Worker w4=new Worker("Jan",1200,4);
        Manager m1=new Manager("Jesper",15000,5);
        w1.work();
        w2.work();
        w3.work();
        w4.work();
        m1.work();
    }
}