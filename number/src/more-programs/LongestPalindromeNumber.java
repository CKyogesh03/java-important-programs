public class LongestPalindromeNumber {
    //note: to find the largest palindrome quickly then start  from 999 and to 100
    static int findFirstLongestPalindromFromGivenRange(int from,int to){
        int longest=0;
        for (int i=from;i<=to;i++){
            for (int j=from;j<=to;j++){
                int multiple=i*j;
                int reversed=reverse(multiple);

                if (multiple==reversed) {
                    if (longest<multiple) {
                        longest = multiple;
                    }
                }
            }
        }
        return longest;
    }
    static int reverse(int n){
        int reversed=Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse().toString());
        return reversed;
    }
    public static void main(String[] args) {
        int palindrome=findFirstLongestPalindromFromGivenRange(100,999);
        System.out.println(palindrome);
    }
}
