package com.company;

public class StarTriangle {


    public StarTriangle(int x){
        for(int i = 0; i<=x; i++){
            for(int j=0; j<i; ++j){
                System.out.print("[*]");
            }
            System.out.println();
        }
    }
}
