package numberArray.moreprograms;

public class ChallengingToken {
    static String reverse(String n){
        String reverse="";
        for(int i=n.length()-1;i>=0;i--){
            reverse+=n.charAt(i);
        }
        return reverse;
    }
    public static void main(String args[]){
        String s="coderbyte",challenge="1esf0rzoa8",sum=reverse(s)+challenge,result="";
        for(int i=0;i<sum.length();i++){
            int logic=i+1;
            if(logic%4==0)
                result+="_";
            else
                result+=sum.charAt(i);
        }
        System.out.println(result);
    }
}
