public class CommonElementIn3SortedArrays {
    public static void main(String[] args) {
        //Common elements in three sorted arrays:
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b={1,2,4,5,6,8,10};
        int[] c={1,3,5,7,9,10};
        for (int i=0;i<=a.length-1;i++){
            for (int j=0;j<=b.length-1;j++){
                for (int k=0;k<=c.length-1;k++){
                    if(a[i]==b[j] && a[i]== c[k]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
