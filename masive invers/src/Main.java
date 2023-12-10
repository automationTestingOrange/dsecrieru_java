import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Introdu numarul de cifre in array:");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Introdu cifrele in array:");
        for(int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        System.out.print("Array:");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }

        int start = 0;
        int end = n - 1;
        while (start < end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
        System.out.print("Reversed Array:");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }




    }
}