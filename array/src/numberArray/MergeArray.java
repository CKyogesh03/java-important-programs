package numberArray;

import java.util.Arrays;

public class MergeArray {
    static void method1(){
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] merge = new int[(a.length) + (b.length)];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            merge[x] = a[i];
            x++;
        }
        for (int j = 0; j < b.length; j++) {
            merge[x] = b[j];
            x++;
        }
        System.out.println(Arrays.toString(merge));
    }

    static void method2(){
            int a[]={1,2,3};
            int b[]={4,5,6};
            int c[]=new int[a.length+b.length];
            int index=0;
            for (int i=0;i<a.length;i++,index++){
                c[index]=a[i]; //index++
            }
            for (int i=0;i<b.length;i++,index++){
                c[index]=b[i]; //index++
            }
            System.out.println(Arrays.toString(c));
        }
    public static void main(String[] args) {
        method1();
    }
}
