package numberArray.moreprograms;

public class Find_IsSorted {
    public static void main(String args[]){
        int[] arr={1,2,3};
        String result="sorted";
        for (int i=0;i< arr.length-1;i++){ //stop comparison before 1 element`
            if(arr[i]>arr[i+1]){ //logic for ascending order
                result="unsorted";
                break;
            }
        }
        System.out.println(result);
    }
}