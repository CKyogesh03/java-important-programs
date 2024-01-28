package numberArray;

import java.util.Arrays;

public class CopyArray {
    static void method1(){
        //Array - is an object , Arrays - is a class
        //[I@15aeb7ab - address of array looks like that it starts with square bracket( [ )
        //toString() - non static no argument method present in object class
        //toString(obj) - static paraeterised method present in object class
        //Arrays class have many overloaded toString(obj) methods to represent any type of arrays as string.
        int arr[]={3,5,7,9,10};
        int copy[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println(Arrays.toString(copy));
        System.out.println(copy);
    }

    static void method2(){
        int[] arr={10,20,30,40,50};
        int[] copy=new int[arr.length];
    }

    public static void main(String[] args) {
        method1();
    }
}
