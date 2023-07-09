package solid.bad.d;

import java.util.HashMap;
import java.util.Map;

public class ProfileInfo {
    private String userName;
    private String dob;
    private String email;
    Map<String,String> IdName = new HashMap<>();
    Map<String,String> IdEmail = new HashMap<>();
    Map<String,String> Iddob = new HashMap<>();
    public ProfileInfo(){
    }
    public String getUserName(String ID) {
        return IdName.get(ID);
    }

    public void setUserName(String ID,String userName) {
        this.userName = userName;
        IdName.put(ID,userName);
    }
    public String getDob(String ID) {
        return dob;
    }
    public void setDob(String ID,String dob) {
        this.dob = dob;
        Iddob.put(ID,dob);
    }
    public String getEmail(String ID) {
        return IdEmail.get(ID);
    }
    public void setEmail(String ID, String email) {
        this.email = email;
        IdEmail.put(ID,email);
    }
}
