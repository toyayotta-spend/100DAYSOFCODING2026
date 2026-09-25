import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang, lebar, luas;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextDouble();

        luas = panjang * lebar;

        System.out.println("Luas persegi panjang = " + luas);

        input.close();
    }
}
