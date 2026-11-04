import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int faktorial = 1;

        System.out.print("Masukkan bilangan: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }

        System.out.println(n + "! = " + faktorial);

    }
}
