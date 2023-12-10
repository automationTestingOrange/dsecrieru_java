import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a;
        a= new int[6];

        System.out.println("Introdu cifrele in array:");
        for(int i=0;i<a.length;i++){
            a[i]= in.nextInt();
        }

       System.out.print("Numerele biletului:");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        int sum1=0 ,sum2=0;
        for (int i=0;i< a.length/2;i++){
            sum1+=a[i];
        }
        for (int i= a.length/2 ;i< a.length;i++){
            sum2+=a[i];
        }
        System.out.println("\n");
        if (sum2==sum1) {
            System.out.println("Bilet happy :)");
        } else {
            System.out.println("Bilet NU happy :(");
        }

    }}

