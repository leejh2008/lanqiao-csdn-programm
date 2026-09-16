package Array;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/2 19:14
 * @description
 */
public class Insert {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }



    }
}
