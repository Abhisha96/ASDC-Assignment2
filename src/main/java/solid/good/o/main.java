package solid.good.o;

import solid.good.o.Employee;

public class main {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Kavisha",21,"kt@gmail.com");
        System.out.println(emp.getAge());
        System.out.println(emp.getName());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee ("Abhisha",11,"at@gmail.com");
        fullTimeEmployee.setSalary(4000);
        fullTimeEmployee.setPosition("Devleoper");
        System.out.println(fullTimeEmployee.getSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nisha",29,"Business Analyst");
        partTimeEmployee.setSalary(2000);
        System.out.println(partTimeEmployee.getSalary());

        Developer developer = new Developer("Abhisha",26,"ab@gmail.com");
        System.out.println(developer.getAge());
        developer.setPosition("developer");
        developer.setShiftTime("morning");
        System.out.println(developer.getShiftTime());
        System.out.println(developer.getPosition());
    }
}
