package solid.good.l;

public abstract class abstractinternDev {
    String Id;
    String name;
    int age;
    public abstractinternDev(String Id, String name, int age){
        this.Id = Id;
        this.name = name;
        this.age = age;
    }
    abstract void writeCode();
    abstract boolean setYearsExperience(int yearsExperience);
    abstract boolean setSalary(double salary);
}
