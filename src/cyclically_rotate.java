import java.util.*;
public class cyclically_rotate {
    public void  cyclically_Rotate_Number(int[] arr , int n) {
        int last_ele=arr[n-1];

        for(int i=n-2;i>=0;i--) {
            arr[i+1]=arr[i];

        }arr[0]=last_ele;

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cyclically_rotate obj = new cyclically_rotate();
        obj.cyclically_Rotate_Number(arr,n);
    }
}
