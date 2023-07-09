package solid.good.s;

public class StudentInfo {
    private String bannerNo;
    private String name;
    private int age;
    private String email;
    private String dob;
    public StudentInfo(String bannerNo){
        this.bannerNo = bannerNo;
    }
    public String getBannerNo() {
        return bannerNo;
    }
    public void setBannerNo(String bannerNo) {
        this.bannerNo = bannerNo;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void getStudentDetails(){
        System.out.println("Banner No"+getBannerNo());
        System.out.println("Name"+getName());
        System.out.println("Age"+getAge());
        System.out.println("Email"+getEmail());
        System.out.println("Dob"+getDob());
    }
}
