import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        System.out.println("Nilai <= 75 : " + (nilai <= 75));
        System.out.println("Nilai >= 75 : " + (nilai >= 75));

    }
}
