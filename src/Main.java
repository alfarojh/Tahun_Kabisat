import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Untuk mengambil data dari CLI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        // Untuk menampilkan hasil ke CLI
        System.out.println(cekKabisat(tahun));
    }
    // function untuk mengecek apakah tahun tersebut merupakan kabisat atau bukan
    public static String cekKabisat(int tahun){
        // Jika tahun habis dibagi 400 atau 4 dan tidak habis dibagi 100, maka tahun tersebut merupakan kabisat
        if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
            return "Tahun " + tahun + " adalah tahun kabisat";
        } else {
            return "Tahun " + tahun + " bukan tahun kabisat";
        }
    }
}