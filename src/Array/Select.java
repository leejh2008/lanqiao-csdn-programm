package Array;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/1 21:46
 * @description
 */
public class Select {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length-1;j++){
            int min=j;
            for (int i=j+1;i<arr.length;i++){
                if(arr[min]>arr[i]){
                    min=i;
                }
            }
            int temp=arr[j];
            arr[j]=arr[min];
            arr[min]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
    }
}
