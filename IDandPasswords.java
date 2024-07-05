import java.util.HashMap;

public class IDandPasswords {

    private HashMap<String,String> logininfo = new HashMap<String,String>();

    public IDandPasswords(){

        logininfo.put("Laak","PASSWORD");
        logininfo.put("Sai","PIN");
        logininfo.put("Siri","sissy123");

    }
    public HashMap<String, String> getLoginInfo(){
        return logininfo;
    }


}