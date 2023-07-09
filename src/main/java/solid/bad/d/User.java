package solid.bad.d;

import java.util.Map;

public class User {
    private String ID;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private UserAuthentication userAuth;
    private ProfileInfo profileInfo;
    public User(String Id, String password, String securityQuestion, String securityAnswer) {
        this.ID = Id;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.userAuth = new UserAuthentication();
        this.profileInfo = new ProfileInfo();
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }
    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }
    public String getSecurityAnswer() {
        return securityAnswer;
    }
    public Boolean addUser() {
        return userAuth.addUser(getID(), getPassword());
    }
    public String getPass() {
        return userAuth.getPass(getID());
    }
    public Boolean addSecurityQA()
    {
        return userAuth.addSecurityQA(getID(), getSecurityQuestion(), getSecurityAnswer());
    }
    public Map getSecurityQA(){
        return userAuth.getSecurityQA(getID());
    }
    public void addUserName(String userName){
        profileInfo.setUserName(getID(),userName);
    }
    public void adddob(String dob){
        profileInfo.setDob(getID(),dob);
    }
    public void addEmail(String email){
        profileInfo.setEmail(getID(),email);
    }
    public String getDob() {
        return profileInfo.getDob(getID());
    }
    public String getEmail() {
        return profileInfo.getEmail(getID());
    }
    public String getUserName() {
        return profileInfo.getUserName(getID());
    }
}