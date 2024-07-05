import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        HashMap<String, String> loginInfo = idandPasswords.getLoginInfo();
        if (loginInfo != null) {
            LoginPage loginPage = new LoginPage(loginInfo);
        } else {
            System.out.println("Error: Login info is null");
        }
    }
}
