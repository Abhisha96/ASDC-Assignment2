package solid.good.l;

public abstract class seniorDev extends Developer {
    public seniorDev(String Id, String name, int age) {
        super(Id, name, age);
    }
    abstract void manageTeam();
    abstract void reviewCode();
    abstract void hireJuniorDevelopers();
}
