
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password;
        String user, pass;

        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat username: ");
        username = input.nextLine();

        System.out.print("Buat password: ");
        password = input.nextLine();

        System.out.println("\n=== LOGIN ===");

        do {
            System.out.print("Username: ");
            user = input.nextLine();

            System.out.print("Password: ");
            pass = input.nextLine();

            if (!user.equals(username) || !pass.equals(password)) {
                System.out.println("Login salah, coba lagi!\n");
            }

        } while (!user.equals(username) || !pass.equals(password));

        System.out.println("Login berhasil!");
        System.out.println("Selamat datang " + username);

    }
          }
