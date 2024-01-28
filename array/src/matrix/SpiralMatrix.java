package matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                    {12,13,14,5},
                    {11,16,15,6},
                    {10, 9, 8,7}};
        int rowStart = 0, rowEnd=a.length;
        int colStart = 0, colEnd=a[0].length;

        while(rowStart<rowEnd && colStart<colEnd){
            //print top row(left to right)
            for(int i= colStart;i<colEnd;i++){
                System.out.println(a[rowStart][i]+" ");
            }
            rowStart+=1;
            //print right(top to bottom)
            for (int i=rowStart;i<rowEnd;i++)
                System.out.println(a[i][colEnd-1]+" ");
            colEnd-=1;

            //print bottom(right to left)
            for(int i=colEnd-1;i>=colStart;i--)
                System.out.println(a[rowEnd-1][i]+" ");
            rowEnd-=1;
            //print left(bottom to top)
            for(int i=rowEnd-1;i>=rowStart;i--)
                System.out.println(a[i][colStart]+" ");
            colStart+=1;
        }
    }
}