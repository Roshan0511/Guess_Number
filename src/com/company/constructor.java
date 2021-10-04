package com.company;
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comNum = (int)(Math.random()*100);

        int count = 1;

        while (true){
            System.out.print("Enter your Number : ");
            int userNum = sc.nextInt();

            if (comNum == userNum){
                System.out.println("Woohoo You Win !!");
                break;
            }
            else if (comNum > userNum){
                System.out.println("Your number is too low !!");
            }
            else{
                System.out.println("Your number is too high !!");
            }

            System.out.println("");
            count++;
        }
        System.out.println("");
        System.out.println("You get correct Answer in " + count + " chances");
    }
}