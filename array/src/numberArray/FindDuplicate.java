import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    static void method1(){
        int[] arr = {1, -2, 1, 3, -2, -2};
        boolean[] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(visited[i]==true)  //2. repeated elements will not iterate again
                continue;
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;  // 1. repeated element's index in boolean array is reassigned with true
                    count++;
                }
            }
            if (count>1) {
                System.out.println(arr[i]);
            }
        }
    }
    static void method2(){
        int[] arr={1,2,2,2,2,2,3,3,4,4,4};
        Set s=new HashSet();
        for(int n:arr){
            if(s.add(n)==false){
                System.out.print(n+" ");
            }
        }
    }
    static void method3(){
        int[] arr={1,2,2,2,2,2,3,3,4,4,4};
        int[] duplicate=new int[arr.length];int d=0;
        int[] unique=new int[arr.length];int u=0;
        Set s=new HashSet();
        for(int n:arr){
            if(s.add(n)==true){
//                unique[u++]=n;
                System.out.println("unique "+n);
            }
            else
//                duplicate[d++]=n;
            System.out.println("duplicate "+n);
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(unique));
//        System.out.println(Arrays.toString(duplicate));
    }
    public static void main(String[] args) {
//        method1();
        method2();
//        method3();
    }
}