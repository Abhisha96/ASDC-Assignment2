package solid.good.s;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StudentCourse {
    // gets the enrolled courses, taught by courses, and grades by courses
    private Map<String,String> enrolledCourse;
    private String bannerNo;
    public StudentCourse(String bannerNo){
       enrolledCourse = new HashMap<>();
       this.bannerNo = bannerNo;
    }
    public String getCoursesByBannerNo(List<String> courseList) {
        for(int i=0;i<courseList.size();i++){
            enrolledCourse.put(bannerNo,courseList.get(i));
        }
        return enrolledCourse.get(bannerNo);
    }
    public void getProfessorForCourse(Map<String,String> professorCourse){
        for(Map.Entry<String,String> taughtByCourse: professorCourse.entrySet()){
            String courseName = taughtByCourse.getKey();
            String professorName = taughtByCourse.getValue();
            System.out.println(courseName+""+professorName+""+bannerNo);
        }
    }

}
