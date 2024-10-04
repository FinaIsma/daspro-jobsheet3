public class ContohVariabel {
    public static void main(String[] args) {
        String hobi = "Dance";
        boolean pandai = true;
        char jenisKelamin = 'P';
        byte umur = 18;
        double $ipk = 4.00, tinggi =1.55;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " +pandai);
        System.out.println("Jenis kelamin: " +jenisKelamin);
        System.out.println("Umurku saat ini: " +umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
