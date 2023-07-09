package solid.good.o;

public class Employee {
    private String name;
    private int age;
    private String emailId;
    public Employee(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
     //   this.position = position;
        this.emailId = emailId;
       // this.roleType = roleType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
