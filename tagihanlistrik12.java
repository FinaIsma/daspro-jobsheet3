/**
 * tagihanlistrik12
 */
import java.util.Scanner;
public class tagihanlistrik12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah penggunaan listrik
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaanListrik = scanner.nextDouble();

        // Tarif listrik per kWh
        double tarifPerKwh = 1500;

        // Menghitung total tagihan listrik
        double totalTagihan = penggunaanListrik * tarifPerKwh;

        // Mengecek apakah penggunaan listrik melebihi 500 kWh
        boolean melebihiBatas = penggunaanListrik > 500;

        // Output hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + melebihiBatas);

    }
}