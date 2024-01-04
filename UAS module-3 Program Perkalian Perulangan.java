import java.util.Scanner;

public class PerkalianProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan batas perkalian: ");
        int batasan = scanner.nextInt();

        System.out.println("Masukkan angka untuk perkalian: ");
        int angka = scanner.nextInt();
        
        System.out.println("Tabel perkalian untuk " + angka + " hingga " + batasan + " adalah:");

        for (int i = 1; i <= batasan; i++) {
            int hasil = angka * i;
            System.out.println(i + " x " + angka + " = " + hasil);
        }

        scanner.close();
    }
}