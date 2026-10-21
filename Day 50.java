import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.print("Masukkan bilangan bulat: ");
        bilangan = input.nextInt();

        System.out.println("Bilangan tersebut termasuk " +
            ((bilangan % 2 != 0) ? "Ganjil" : "Genap"));
    }
}
