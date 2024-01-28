//given number divisible by 1 to n without remainder
//factors of 6 -> 2,3
//factors of 10 ->
public class Find_Factors {
    public static void main(String args[]){
        int n=40;
        System.out.print("factors of "+n+" is : ");
        for (int i=1;i<=n;i++){
            if(n%i==0){ //9%3// not i%n (3%9)
                System.out.print(i+",");
            }
        }
    }
}