import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Bilangan nol");
        }
    }
}
