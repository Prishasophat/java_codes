import java.util.*;
public class minMax {
    public static void minMaxNumber(int [] a, int n) {
        Arrays.sort(a);
        int min = a[0];
        int max = a[n-1];
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int [] a=new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     minMaxNumber(a,n);

    }
}
