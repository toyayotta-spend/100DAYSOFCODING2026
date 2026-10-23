import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        while (angka <= 5) {
            System.out.println("Angka: " + angka);
            angka++;
        }
    }
}
