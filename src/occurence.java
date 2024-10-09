import java.util.*;
public class occurence {
    public static int count_Occurence(int[] arr,int x)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=count_Occurence(a,x);
        System.out.println(result);
    }
}
