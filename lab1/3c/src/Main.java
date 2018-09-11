import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        for(int i = a; i<=b; ++i) {
            for(int j = 1; j<b; ++j){
                if(i==j*j) System.out.println(i);
            }
        }
    }

}
