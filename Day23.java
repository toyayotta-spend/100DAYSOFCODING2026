import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;

        System.out.println("Luas persegi = " + luas);

        input.close();
    }
}
