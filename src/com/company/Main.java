package com.company;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,6,2,-9,76,12,4,9,1};

        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}