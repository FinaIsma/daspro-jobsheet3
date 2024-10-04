import java.util.Scanner;

public class Gaji12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja;
        double bonus, pajak, gajibulanan;

        System.out.println("Masukkan Jumlah Jam Kerja: ");
        jamKerja = sc.nextInt();

        gajibulanan = jamKerja*5000000;
        System.out.println("Gaji Kotor: " +gajibulanan);

        bonus = 10*gajibulanan/100;
        gajibulanan = gajibulanan + bonus;
        System.out.println("Bonus: " +bonus);

        pajak = 5*gajibulanan/100;
        gajibulanan  = gajibulanan - pajak;
        System.out.println("Pajak: " +pajak);
        System.out.println("Gaji Bersih: " +gajibulanan);
    }
}
