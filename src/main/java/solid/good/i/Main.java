package solid.good.i;

public class Main {
    public static void main(String[] args) {
        juniorDeveloper dev = new juniorDeveloper("101","Abhisha");
        dev.writeCode();
        dev.debugCode();

        Intern intern = new Intern("102","Nisha");
        intern.writeCode();

        Manager manager = new Manager("103","Kashish");
        manager.manageTeam();
        manager.hireTeam();

        seniorDeveloper seniorDev = new seniorDeveloper("104","Kashish");
        seniorDev.manageTeam();
        seniorDev.hireTeam();


    }
}
