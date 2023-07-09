package solid.bad.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args){

        Student student = new Student("93764","Abhisha",26,"ab@gmail.com","19960902");
        student.setFeesPaid(15000.00);

        ArrayList<String> enrolledcourseList = new ArrayList();
        enrolledcourseList.add("Intro to Programming");
        enrolledcourseList.add("Database design");
        enrolledcourseList.add("DataStructures and Algorithms");
        System.out.println("For banner no"+student.getbannerNo()+""+student.getEnrolledCoursesbyBanner(enrolledcourseList));

        Map<String,String> gradeCourse = new HashMap<>();
        gradeCourse.put(enrolledcourseList.get(0),"A+");
        gradeCourse.put(enrolledcourseList.get(1),"A-");
        gradeCourse.put(enrolledcourseList.get(2),"A");
        student.getGradesbyCourse(gradeCourse);

        Map<String,Double> courseFee = new HashMap<>();
        courseFee.put(enrolledcourseList.get(0),1000.00);
        courseFee.put(enrolledcourseList.get(1),4000.00);
        courseFee.put(enrolledcourseList.get(2),5000.00);
        System.out.println(student.getTotalFeesPaid(courseFee));
        student.getFeesbyCourse(courseFee);

        Map<String,String> professorCourse = new HashMap<>();
        professorCourse.put(enrolledcourseList.get(0),"Mr. Akshay");
        professorCourse.put(enrolledcourseList.get(1),"Mr. Rajesh");
        professorCourse.put(enrolledcourseList.get(2),"Mr. Zin Lee");
        student.getTaughtByCourse(professorCourse);

        student.getStudentDetails();

        student.pendingFees(student.getFeesPaid());
    }
}
