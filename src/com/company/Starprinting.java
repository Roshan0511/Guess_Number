package com.company;

public class Starprinting {
    public static void main(String[] args) {
        int i,j;
        for (i=4; i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
