package solid.good.d;

import java.util.HashMap;
import java.util.Map;

public class ProfileInfo implements ProfileInformation {
    Map<String,String> IdName = new HashMap<>();
    Map<String,String> IdEmail = new HashMap<>();
    Map<String,String> Iddob = new HashMap<>();
    public ProfileInfo(){
    }
    public String getUserName(String ID) {
        return IdName.get(ID);
    }
    public void setUserName(String ID,String userName) {
        IdName.put(ID,userName);
    }
    public void setDob(String ID,String dob) {
        Iddob.put(ID,dob);
    }
    public String getEmail(String ID) {
        return IdEmail.get(ID);
    }
    public void setEmail(String ID, String email) {
        IdEmail.put(ID,email);
    }
    public String getDob(String ID){
        return Iddob.get(ID);
    }
}
