import java.util.Scanner;

public class CalcApp {
    public static String webSite = "Calc.com";
    private int num1;
    private String opcode;
    private int num2;

    public String calc (int a, String b, int c) {
        num1 = a;
        opcode = b;
        num2 = c;
        int result = num1 + num2;
        return num1 +" "+opcode +" "+ num2 + " = " + result;


    }
}
