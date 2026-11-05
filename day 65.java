import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi garis: ");
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            System.out.println("*");
        }
    }
}
