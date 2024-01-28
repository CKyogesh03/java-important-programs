package more_programs;
public class Count_Given_Number_Occurence {
    public static void main(String args[]){
        int n=1343243;
        int findOccurenceOf=3;
        int count=0;
        while (n>0){
            int last=n%10;
            if(last==findOccurenceOf) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}