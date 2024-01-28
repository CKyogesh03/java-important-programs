package charArray;
import java.util.Arrays;
public class copyArray {
    public static void main(String args[]){
        char[] ch={'j','a','v','a'};
        char[] copy=new char[ch.length];
        for (int i=0;i<ch.length;i++){
            copy[i]=ch[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
