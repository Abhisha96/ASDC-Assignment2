package solid.good.o;

public class main {
    public static void main(String[] args) {
        Developer developer = new Developer("Abhisha",26,"ab@gmail.com");
        System.out.println(developer.getAge());
        System.out.println(developer.getShiftTime());
        System.out.println(developer.getPosition());
    }
}
