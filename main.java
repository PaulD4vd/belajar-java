package src.Day5;

import java.util.Scanner;
import java.util.Locale;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String kata;
        int Angka = 0;

        while (true) {
            System.out.print("Masukkan angka = ");
            if (input.hasNextInt()) {
                Angka = input.nextInt();
                kata = "Ini adalah Angka";
                System.out.println(kata);
                break;
            } else {
                System.out.println("bukan angka");
                input.nextLine();
                continue;
            }

        }

        if (Angka % 2 != 0) {
            kata = "ini adalah angka ganjil";
        } else {
            kata = "ini adalah angka genap";
        }

        System.out.println(kata);
    }
}