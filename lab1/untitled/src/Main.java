import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c =  Math.pow(a*a+b*b, 0.5);
        int c1 = (int) c;
        System.out.println(c1);
    }
}
