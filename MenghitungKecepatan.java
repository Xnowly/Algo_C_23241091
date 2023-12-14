
import java.util.Scanner;

public class HitungKecepatan {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        float hasilKecepatan;

        System.out.println("ANDA INGIN MENCARI BESAR KELAJUAN DAN PERCEPATAN");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("MASUKAN JARAK TEMPUH (meter) : ");
        float jarak = simpan.nextFloat();
        System.out.print("MASUKAN WAKTU TEMPUH (sekon) : ");
        int waktu = simpan.nextInt();
        hasilKecepatan = jarak / waktu;
        System.out.println("HASILNYA ADALAH = " + hasilKecepatan);
    }
}
