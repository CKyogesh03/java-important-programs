package numberArray;

import java.util.Arrays;

public class FindMinMax {
    //find Nth min without sorting //pending
    static void secondMinWithoutSort(int nth){
        int[] arr={5,4,3,2,1};
        int smallest=arr[0],nthSmallest=0;
        int secondLargest=0;
        //first smallest
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println(smallest);
            //second smallest

    }

    //find 2nd max without sorting
    static void thirdLargestWithoutSort(){
        int firstLargest=0,secondLargest=0,thirdLargest=0;
        int[] arr={5,2,1,4,3};
        //1st largest
        for (int i=0;i<arr.length;i++){
            if (firstLargest<arr[i]){
                firstLargest=arr[i];
            }
        }
        System.out.println("1stlargest "+firstLargest);
        //2nd largest
        for (int i=0;i<arr.length;i++){
            if (arr[i]<firstLargest){
                if(arr[i]>secondLargest){
                    secondLargest=arr[i];
                }
            }
        }
        System.out.println("2nd largest "+secondLargest);
        //3rd largest
        for (int i=0;i<arr.length;i++){
            if (arr[i]<firstLargest){
                if(arr[i]<secondLargest){
                    if (arr[i]>thirdLargest){
                        thirdLargest=arr[i];
                    }
                }
            }
        }
        System.out.println("3rd largest"+thirdLargest);
    }

    //pending
    static void thirdLargestWithoutSort2(){
        int firstLargest=0,secondLargest=0,thirdLargest=0;
        int[] arr={5,2,1,4,3};
        //1st largest
        for (int i=0;i<arr.length;i++){
            if (firstLargest<arr[i]){
                firstLargest=arr[i];
            }
        }

    }
    //smallest - using sort method
    static void min(){
        int arr[] = {9,6,7,3,2,3};
        Arrays.sort(arr);
        System.out.println(arr[0]); //1st min element
        System.out.println(arr[1]); //2nd min element
    }

    //largest
    static void max(){
        int arr[]={1,2,3,4,5};
        int largest=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }

    static void findMinMax(){
        int arr[]={3,5,7,9,10};
        int min=arr[0], max=arr[0];  //don't initialise 0 instead use first arr
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("min: "+min+" ,max: "+max);
    }

    public static void main(String[] args) {
//        NthMinWithoutSort(2);
        thirdLargestWithoutSort();

    }
}