public class FindFrequency {
    //find number of occurence
    public static void main(String args[]) {
        int[] arr = {1, -2, 1, 3, -2, -2};
        boolean[] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(visited[i]==true)  //2. repeated elements will not iterate again
                continue;
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;  // 1. repeated element's index in boolean array is reassigned with true
                    count++;
                }
            }
                System.out.println(arr[i] + " present " + count + " times");
        }
    }
}