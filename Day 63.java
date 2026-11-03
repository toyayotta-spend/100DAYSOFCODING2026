import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        int hasil = 1;

        System.out.print("Masukkan nilai M: ");
        m = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);
    }
}
