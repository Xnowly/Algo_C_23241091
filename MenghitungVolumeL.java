import java.util.Scanner;

public class HitungVolumeBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        System.out.println("Volume bola adalah: " + volume);

        input.close();
    }
}