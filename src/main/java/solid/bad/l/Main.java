package solid.bad.l;

public class Main {
    public static void main(String[] args) {
        //objects of a superclass should be replaceable with objects of their subclasses
        // without affecting the correctness of a program.
        SeniorDeveloper juniorDev = new JuniorDeveloper();
        juniorDev.setSalary(3000);
        juniorDev.setYearsExperience(3);
        System.out.println(juniorDev.calculateSalary());
        juniorDev.debugCode();
        juniorDev.manageTeam();
        juniorDev.hireJuniorDevelopers();

        SeniorDeveloper internDev = new Intern();
        internDev.setSalary(2000);
        internDev.setYearsExperience(1);
        System.out.println(internDev.calculateSalary());
        internDev.debugCode();
        internDev.manageTeam();
        internDev.hireJuniorDevelopers();
    }
}
