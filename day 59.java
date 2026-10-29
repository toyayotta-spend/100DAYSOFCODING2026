import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M, N;

        System.out.print("Masukkan nilai M: ");
        M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
