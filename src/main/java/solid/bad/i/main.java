package solid.bad.i;

public class main {
    public static void main(String[] args) {
        juniorDeveloper dev = new juniorDeveloper("101","Abhisha");
        dev.debugCode();
        dev.manageTeam();
        dev.reviewCode();
        dev.hireTeam();

        Intern intern = new Intern("102","Nisha");
        intern.writeCode();
        intern.debugCode();
        intern.reviewCode();
        intern.hireTeam();
        intern.manageTeam();

        developer manager = new Manager("103","Kashish");
        manager.manageTeam();
        manager.hireTeam();
    }
}
