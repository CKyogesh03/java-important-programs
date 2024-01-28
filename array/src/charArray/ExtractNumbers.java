package charArray;

import java.util.Arrays;

public class ExtractNumbers {
    public static void main(String[] args) {
        //extract numbers only
        char[] arr={'a','0','b','1','c','3'};
        char[] arr2={'a',0,'b',1,'c',3};
        char[] extracted=new char[arr.length];
        System.out.println(arr[1]==arr[1]); //true
        System.out.println(arr[3]==arr[3]); //true //
        for (int i=0,j=0;i<arr.length;i++){
            if(arr[i]>='0'&&arr[i]<='9'){ //if(arr[i]>=48&&arr[i]<=57){
                extracted[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(extracted));
    }
}