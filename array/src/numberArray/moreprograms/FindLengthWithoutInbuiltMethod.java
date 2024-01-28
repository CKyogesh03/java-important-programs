package numberArray.moreprograms;
// pending
public class FindLengthWithoutInbuiltMethod {
    public static void main(String args[]){
        int[] arr={10,20,30};
        int length=0,i=0;
        try{
            while (true){
                System.out.println(arr[i]);
                length++;
            }
        }
        catch (NullPointerException exception){
            System.out.println("reached end");
        }
        System.out.println(length);
        System.out.println("Hii");
    }
}