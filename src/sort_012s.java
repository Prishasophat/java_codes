import java.util.*;
public class sort_012s {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter only 0s , 1s and 2s");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
