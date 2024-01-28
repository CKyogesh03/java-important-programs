package numberArray.moreprograms;

public class NthOccurenceIndex {
    public static void main(String args[]){
        int[] arr={3,1,2,3,2,3,1};
        int count=0,num=3,occurence=2;
        boolean res=false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == num) {
                count++;
            }
            if (count == occurence) {
                res = true;
                break;
            }
        }
        if(res)
            System.out.println(num+" is present "+occurence+" times");
        else
            System.out.println(num+" is not present"+occurence+"times");
    }
}
