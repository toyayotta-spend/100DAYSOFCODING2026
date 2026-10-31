import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, jumlah = 0;

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            jumlah = jumlah + i;
        }

        System.out.println("Jumlah angka 1 sampai " + N + " = " + jumlah);
    }
}
