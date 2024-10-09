import java.util.*;
public class reverse
{
    public static void reverse_Arr(int [] arr, int n)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse_Arr(arr , n);
    }
}