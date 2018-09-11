import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean a = (n%4==0 && n%4!=0);
        boolean b = (n%400==0);
        if (a || b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
