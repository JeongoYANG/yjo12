import java.util.Scanner;

public class LoginApp {
    public static String website = "Naver";
    private String id;
    private String pw;
    private String name;
    public String login(String a, String b, String c){
        id = a;
        pw = b;
        name = c;
        return "ID : "+id+", PW : "+pw+", name : "+name;
    }
}
