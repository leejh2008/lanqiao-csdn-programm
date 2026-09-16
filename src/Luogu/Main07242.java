package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/24 20:08
 * @description
 */
public class Main07242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=1000;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
               min = arr[i];
            }
        }
        System.out.println(min);
    }

    }

