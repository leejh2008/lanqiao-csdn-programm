package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/24 20:29
 * @description
 */
public class Main07243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    count++;

                }
            }
            System.out.print(count+" ");
        }
    }
}

