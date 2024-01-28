public class RemoveVowels {
    public static void main(String args[]){
        String name="Yogesh";
        String noVowel="";
        char[] vowel={'a','A','e','E','i','I','o','O','u','U'};
        for (int i=0;i<name.length();i++){
            for (int j=0;j<vowel.length;j++){
                if(name.charAt(i)==vowel[j]){
                }
                else{
                    noVowel=noVowel+name.charAt(i);
                }
            }
        }
        System.out.println(noVowel);
}}