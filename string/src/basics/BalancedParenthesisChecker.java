package basics;

//valid parenthesis checker
public class BalancedParenthesisChecker {
    static void balancedParenthesisChecker1(){
        String s="sf((fd()sf))()hg((()()))";
        int c1=0,c2=0;
        for (int i=0;i<s.length();i++){
            if (c2>c1)  //close > open
                break;
            else if (s.charAt(i)=='(')
                c1++;
            else if(s.charAt(i)==')')
                c2++;
        }
        String res=(c2==c1&&c1>0&&c2>0)?"balanced":"not balanced";
        System.out.println(res);
    }
    static void balancedParenthesisChecker2(){

    }
    public static void main(String[] args) {
        balancedParenthesisChecker1();
    }
}
