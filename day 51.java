import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka batas: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println("Angka ke-" + i);
        }
    }
}
