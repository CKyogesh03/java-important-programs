package numberArray;

import java.util.Arrays;

/*
  1st largest element
  2nd largest element
  nth largest element
 */
public class Nth_Largest_Element {
    public static void main(String[] args) {
        int[] arr={6,3,7,5,10,1};
        Arrays.sort(arr);
        int length=arr.length;
        System.out.println(arr[length-1]);//10 //1st largest array
        System.out.println(arr[length-2]);//7  //2nd largest array
        System.out.println(arr[length-3]);//6  //2nd largest array
    }
}