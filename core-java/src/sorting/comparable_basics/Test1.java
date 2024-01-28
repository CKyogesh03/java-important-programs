package sorting.comparable_basics;

import java.util.Arrays;

public class Test1 {
    public static void main(String args[]){
        Integer five=5;
        Integer[] others={0,5,10,-50,50};

        for (Integer i:others){
            int val= five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n",five,(val==0?"==":(val<0)?"<":">"),i,val);
        }

        String banana="banana";
        String[] fruit={"apple","banana","pear","BANANA"};
        for (String s:fruit){
           int val=banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n",banana,(val==0?"==":(val<0)?"<":">"),s,val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A'+" "+"a:"+(int)'a');
        System.out.println("B:"+(int)'B'+" "+"b:"+(int)'b');
        System.out.println("C:"+(int)'C'+" "+"c:"+(int)'c');
        System.out.println("Tim".compareTo("Tin")); // m=109,n=110 -> 109- 110 = -1
    }
}