package solid.good.d;

public class Main {
    public static void main(String[] args) {
        AuthenticationInterface userAuth = new UserAuthentication();
        ProfileInformation profileInfo = new ProfileInfo();

        User user1 = new User("101","102","What is my favorite movie","Krishna",userAuth,profileInfo);

        user1.addUserName("Abhisha");
        user1.adddob("02-09-1996");
        user1.addEmail("at@dal.ca");

        System.out.println(user1.getDob());
        System.out.println(user1.getEmail());
        System.out.println(user1.getUserName());

        user1.addUser();
        System.out.println(user1.getPass());
        user1.addSecurityQA();
        System.out.println(user1.getSecurityQA());

        AuthenticationInterface userAuth1 = new UserAuthentication();
        ProfileInformation profileInfo1 = new ProfileInfo();
        User user2 = new User("102","103","Who is my favorite person","Krishna",userAuth1,profileInfo1);

        user2.addUserName("Krishna");
        user2.adddob("09-09-1996");
        user2.addEmail("nt@dal.ca");
        System.out.println(user2.getDob());
        System.out.println(user2.getEmail());
        System.out.println(user2.getUserName());
        user2.addUser();
        System.out.println(user2.getPass());
        user2.addSecurityQA();
        System.out.println(user2.getSecurityQA());
    }
}
