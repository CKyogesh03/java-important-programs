package numberArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnique {
    //distinct element
    //remove duplicate and print unique
    static void method1(){
        int[] arr = {1, -2, 1, 3, -2, -2};
        boolean[] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(visited[i]==true)  //2. repeated elements will not iterate again
                continue;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;  // 1. repeated element's index in boolean array is reassigned with true
                }
            }
            System.out.println(arr[i]);
        }
    }
    static void method2(){
        //works only for positive numbers //replace duplicates with -1
        int[] arr = {1, 2, 1, 3, 2, 2};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
    }
    static void method3(){
        int[] arr={1,2,2,2,2,2,3,3,4,4,4};
        Set s=new HashSet();
        for(int n:arr){
            if(s.add(n)==true){
                System.out.println(n);
            }
        }
    }
    static void method4(){
        int[] arr={1,2,2,2,2,2,3,3,4,4,4};

        Set<Integer> set = new HashSet<>();
        int[] result = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (set.add(arr[i])) {
                result[j++] = arr[i];
            }
        }

        result = Arrays.copyOf(result, j);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }
}
