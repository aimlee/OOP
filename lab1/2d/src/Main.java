import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        if(a>0) {
            System.out.println("1");
        }
        else if (a<0){
            System.out.println("-1");
        }
        else System.out.println("0");
    }

}