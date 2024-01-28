public class Find_Smallest_Element {

    public static void main(String args[]){
        //sort //without
        int arr[]={1,2,3,4,5};
        int smallest=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);

    }
}