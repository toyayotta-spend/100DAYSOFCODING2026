import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan: ");
        int suhu = input.nextInt();

        if (suhu < 20) {
            System.out.println("Ruangan Dingin");
        } else if (suhu <= 30) {
            System.out.println("Ruangan Normal");
        } else {
            System.out.println("Ruangan Panas");
        }
    }
}
