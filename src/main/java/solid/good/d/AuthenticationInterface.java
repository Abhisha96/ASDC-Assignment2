package solid.good.d;

import java.util.Map;

public interface AuthenticationInterface {
        public Boolean addUser(String ID, String password);
        public void deleteUser();
        public String getPass(String ID);
        public Boolean addSecurityQA(String ID,String securityQ, String securityA);
        Map getSecurityQA(String id);
}
