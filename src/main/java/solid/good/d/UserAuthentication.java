package solid.good.d;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication implements AuthenticationInterface{
    private Map<String,String> users = new HashMap();
    private Map<String, String> userQA = new HashMap();
    private Map<String,Map<String,String>> userIdQA = new HashMap<>();
    public UserAuthentication(){
    }
    public Boolean addUser(String ID, String password){
        if(ID != null){
            users.put(ID,password);
            return true;
        }
        return false;
    }
    public void deleteUser(){
        users.clear();
        userQA.clear();
        userIdQA.clear();
    }
    public String getPass(String ID){
        return users.get(ID);
    }
    public Boolean addSecurityQA(String ID,String securityQ, String securityA){
        if(ID != "null") {
            userQA.put(securityQ, securityA);
            userIdQA.put(ID, userQA);
            return true;
        }
        return false;
    }
    public Map getSecurityQA(String id) {
        return userIdQA.get(id);
    }
}
