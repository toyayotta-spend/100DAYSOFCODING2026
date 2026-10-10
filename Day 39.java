import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        char operator;

        System.out.print("Angka pertama: ");
        a = input.nextInt();

        System.out.print("Operator (+ atau -): ");
        operator = input.next().charAt(0);

        System.out.print("Angka kedua: ");
        b = input.nextInt();

        if (operator == '+') {
            System.out.println("Hasil = " + (a + b));
        }

        if (operator == '-') {
            System.out.println("Hasil = " + (a - b));
        }
    }
}

