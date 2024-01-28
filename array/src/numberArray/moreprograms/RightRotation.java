package numberArray.moreprograms;

import java.util.Arrays;
import java.util.Scanner;
/*
 1 - 50, 10, 20, 30, 40
 2 - 40, 50, 10, 20, 30
 5 - 10, 20, 30, 40, 50
 7 - 40, 50, 10, 20, 30 //repeates. similar to 2
 10 - 10, 20, 30, 40, 50 //repeates. similar to 5

*/

public class RightRotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the rotation count: ");
        byte n=s.nextByte();
        for (int i=1;i<=n;i++){
            int last=arr[arr.length-1];
            for (int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
                arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
}