
import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usernameDaftar, passwordDaftar;
        String usernameLogin, passwordLogin;

        int percobaan = 0;

        System.out.println("=== DAFTAR AKUN ===");

        System.out.print("Buat username : ");
        usernameDaftar = input.nextLine();

        System.out.print("Buat password : ");
        passwordDaftar = input.nextLine();

        System.out.println("Akun berhasil dibuat!");

        System.out.println("\n=== LOGIN ===");

        while (true) {

            System.out.print("Username : ");
            usernameLogin = input.nextLine();

            System.out.print("Password : ");
            passwordLogin = input.nextLine();

            percobaan++;

            if (usernameLogin.equals(usernameDaftar) &&
                passwordLogin.equals(passwordDaftar)) {

                System.out.println("Login berhasil!");
                System.out.println("Selamat datang, " + usernameDaftar);
                System.out.println("Jumlah percobaan login : " + percobaan);

                break;

            } else {

                System.out.println("Username atau password salah, coba lagi.\n");

            }
        }
    }
}
