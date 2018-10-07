package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n, cnt=0;
        n = scan.nextInt();
        int  a[] = new int[n] ;

	for(int i=0; i<n; ++i){
	a[i] = scan.nextInt();
    }

        for(int i=0; i<n; ++i){
            if(a[i]==0){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
