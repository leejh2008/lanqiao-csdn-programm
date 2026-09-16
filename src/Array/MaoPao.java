package Array;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/23 16:20
 * @description
 */
public class MaoPao {
    public static void main(String[] args) {
        int[]arr=new int[5];


        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        for (int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1-j;i++){
            if(arr[i+1]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }}}
        for(int i=0;i<=arr.length-1;i++){
            int num=arr[i];
            System.out.print(num+"");

        }

    }
}
