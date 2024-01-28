package numberArray.moreprograms;
import java.util.Arrays;
import java.util.Scanner;
/*
 1 - 20, 30, 40, 50, 10
 2 - 30, 40, 50, 10, 20
 3 - 40, 50, 10, 20, 30
 4-  50, 10, 20, 30, 40
 5 - 10, 20, 30, 40, 50
 6-  20, 30, 40, 50, 10  //repeates same sequence
*/
public class LeftRotation {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the rotation count: ");
        byte n=s.nextByte();
        for (int i=1;i<=n;i++){
            int first=arr[0];
            for (int j=0;j<arr.length-1;j++){ //-1 bcoz to store the first element to the last index
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}