
    import java.util.Scanner;

    public class CalcDemo{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CalcApp calcApp = new CalcApp();
            System.out.println(CalcApp.webSite);
            System.out.println("첫번째 기호");
            System.out.println("두번째 기호");
            System.out.println("연산기호");
            int num1 = scanner.nextInt();
            String opcode = scanner.next();
            int num2 = scanner.nextInt();
            String result = calcApp.calc (num1, opcode, num2);
            System.out.println(result);

    }

}
