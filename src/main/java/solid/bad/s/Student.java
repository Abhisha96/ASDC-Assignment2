package solid.bad.s;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    private String bannerNo;
    private String name;
    private int age;
    private String email;
    private String dob;
    private double feesPaid;
    private List enrolledCourse;
    private Double startFees = 0.0;
    public Student(String bannerNo, String name, int age, String email, String dob) {
        this.bannerNo = bannerNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
        enrolledCourse = new ArrayList();
    }
    public String getbannerNo() {
        return bannerNo;
    }
    public void setbannerNo(String bannerNo) {
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
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    // Method to get the list of enrolled courses
    public List getEnrolledCoursesbyBanner(List<String> courseList) {
        for(int i=0;i<courseList.size();i++){
            enrolledCourse.add(courseList.get(i));
        }
        return enrolledCourse;
    }
    public void getStudentDetails(){
        System.out.println("Banner No"+getbannerNo());
        System.out.println("Name"+getName());
        System.out.println("Age"+getAge());
        System.out.println("Email"+getEmail());
        System.out.println("Dob"+getDob());
    }

    public void getGradesbyCourse(Map<String, String> gradesbyCourse) {
        for(Map.Entry<String,String> gradescourse: gradesbyCourse.entrySet()){
            String courseName = gradescourse.getKey();
            String grade = gradescourse.getValue();
            System.out.println(courseName+""+grade);
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getFeesPaid() {
        return feesPaid;
    }
    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }

    //Method to print the fees for the course
    public void getFeesbyCourse(Map<String,Double> courseFee){
        for(Map.Entry<String,Double> feesByCourse: courseFee.entrySet()){
            String courseName = feesByCourse.getKey();
            Double grade = feesByCourse.getValue();
            System.out.println(courseName+""+grade);
        }
    }
    //  Method to calculate total fees paid
    public Double getTotalFeesPaid(Map<String,Double> courseFee){
        for(Double totalFees: courseFee.values())
        {
            totalFees += totalFees + startFees;
            startFees = totalFees;
        }
        return startFees;
    }
    //    Method to calculate pending fees
    public Double pendingFees(Double startFees){
        Double pendingFees = getFeesPaid() - startFees;
        return pendingFees;
    }
    //   Method to get professors for each course
    public void getTaughtByCourse(Map<String,String> professorCourse){
        for(Map.Entry<String,String> taughtByCourse: professorCourse.entrySet()){
            String courseName = taughtByCourse.getKey();
            String professorName = taughtByCourse.getValue();
            System.out.println(courseName+""+professorName);
        }
    }
}
