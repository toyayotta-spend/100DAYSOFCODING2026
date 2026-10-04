import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Keterangan: LULUS");
        } else {
            System.out.println("Keterangan: TIDAK LULUS");
        }

    }
}
