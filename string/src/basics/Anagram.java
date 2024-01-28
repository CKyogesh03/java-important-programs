package basics;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);
            String result=(isAnagram)?"Anagram":"Not Anagram";
            System.out.println(result);
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}
