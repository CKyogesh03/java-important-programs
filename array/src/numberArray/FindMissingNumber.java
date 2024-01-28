public class FindMissingNumber {
static void Method1(){
        int[] arr={1,2,4,5,6};
        int n=arr.length,sum=n*(n+1)/2;
        for (int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
     Method1();
    }
}
