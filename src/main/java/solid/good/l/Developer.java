package solid.good.l;

public abstract class Developer extends abstractinternDev{
    public Developer(String Id, String name, int age) {
        super(Id, name, age);
    }
    abstract void debugCode();
}
