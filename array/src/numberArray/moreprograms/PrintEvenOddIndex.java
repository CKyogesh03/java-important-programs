package numberArray.moreprograms;

public class PrintEvenOddIndex {
    static void method1(){
        int[] arr={1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i=i+2){
            System.out.println("odd "+arr[i]);
        }
        for (int i=1;i<arr.length;i=i+2){
            System.out.println("even "+arr[i]);
        }
    }
    static void method2(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        for (int i=0;;i++)
//            System.out.println(i);
        for (int i=0;i<arr.length;i++){
            if (i%2==0)
                System.out.println("even "+i);
            else System.out.println("odd "+i);
        }

    }
    public static void main(String args[]){
        method2();
    }
}
