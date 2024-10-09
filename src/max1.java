import java.util.*;
public class max1 {
    public int max_row1(int[][] a) {
        int max=0;
        for (int row = 0; row < a.length; row++) {
            int count=0;
            for (int i = 0; i < a[row].length; i++) {
                if(a[row][i]==1)
                {
                    count++;
                }

                if(count>max)
                {
                    max=count;
                }
                else {
                    count=0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] a=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        max1 ob=new max1();
        int result=ob.max_row1(a);
        System.out.println(result);
    }
}
