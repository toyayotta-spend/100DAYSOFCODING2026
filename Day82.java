import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] angka = new int[N];

        // Memasukkan nilai ke dalam Array
        for (int i = 0; i < N; i++) {
            angka[i] = input.nextInt();
        }

        // Menentukan nilai terbesar
        int terbesar = angka[0];

        for (int i = 1; i < N; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println(terbesar);
    }
}
