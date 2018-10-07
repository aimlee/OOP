package com.company;
import java.util.Scanner;
public class Main {

    public static int min(int a, int b, int c, int d){
     int min =a;
     if(a<min) min=a;
        if(b<min) min=b;
        if(c<min) min=c;
        if(d<min) min=d;
        return min;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x,y,z,w;
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        w = scan.nextInt();

        System.out.println(min(x,y,z,w));

    }
}
