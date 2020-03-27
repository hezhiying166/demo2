package com.example.demo;

import java.util.Arrays;

public class BB {
    public static void main(String[] args) {
        int[] numbers = {-5, 7, 3, -5, 10, -1, 0, 20, 6, 8, -15, 9, -15, -11, 0};
        System.out.println(Arrays.toString(numbers));
        int length=numbers.length;
        for (int i = 0; i < length/2+1; i++) {
            int left=0;
            int right=0;
            if(numbers[i]>0) {
                left=i;
                for (int j = numbers.length-1; j >=length/2 ; j--) { 
                    if(numbers[j]<0) {
                        right=j;
                        break;
                    }
                }
                if(left<right) {
                    int num=numbers[left];
                    numbers[left]=numbers[right];
                    numbers[right]=num;
                }else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length-1 ; i >=0; i--) {
            int left=0;
            int right=0;
            if(numbers[i]==0) {
                left=i;
                for (int j = 0; j < length  ; j++) { 
                    if(numbers[j]>0) {
                        right=j;
                        break;
                    }
                }
                if(left>right) {
                    int num=numbers[left];
                    numbers[left]=numbers[right];
                    numbers[right]=num;
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
 
}
