import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner fac= new Scanner(System.in);

        int i;
        int a= fac.nextInt();
        int b=1;




        for (i=1;i<=a;i++){
            b=b*i;
        }

        System.out.println("Factorial al numarului " + a + "este: " + b );
    }
}