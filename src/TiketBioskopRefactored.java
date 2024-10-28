import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Kelas TiketBioskopRefactored mengelola pemesanan tiket bioskop
 * dengan berbagai jenis tiket dan menghitung total harga pesanan.
 */
public class TiketBioskopRefactored {

    /**
     * Map untuk menyimpan jenis tiket dan harga tiket.
     * Kunci: Nama jenis tiket (String)
     * Nilai: Harga tiket (Integer)
     */
    private static final Map<String, Integer> TIKET = new HashMap<>();

    // Blok inisialisasi statis untuk memasukkan data harga tiket
    static {
        TIKET.put("Reguler", 50000);
        TIKET.put("VIP", 100000);
        TIKET.put("VVIP", 150000);
    }

    /**
     * Menghitung total harga tiket berdasarkan jenis dan jumlah tiket.
     *
     * @param jenis  Jenis tiket (contoh: "Reguler", "VIP", "VVIP").
     * @param jumlah Jumlah tiket yang ingin dipesan.
     * @return Total harga tiket (harga per tiket * jumlah tiket).
     * @throws IllegalArgumentException jika jenis tiket tidak valid.
     */
    public static int hitungHargaTiket(String jenis, int jumlah) {
        if (!TIKET.containsKey(jenis)) {
            throw new IllegalArgumentException("Jenis tiket '" + jenis + "' tidak valid.");
        }
        return TIKET.get(jenis) * jumlah;
    }

    /**
     * Memesan tiket dan memberikan detail pesanan.
     *
     * @param jenis  Jenis tiket yang ingin dipesan.
     * @param jumlah Jumlah tiket yang ingin dipesan.
     * @return String berisi detail pesanan dan total harga.
     */
    public static String pesanTiket(String jenis, int jumlah) {
        try {
            int total = hitungHargaTiket(jenis, jumlah);
            return "Pesanan: " + jumlah + " Tiket " + jenis + "\nTotal Harga: Rp" + total;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /**
     * Fungsi utama (main) untuk menjalankan aplikasi pemesanan tiket.
     * Mengambil input dari pengguna berupa jenis tiket dan jumlah tiket,
     * lalu mencetak hasil pemesanan.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis tiket: ");
        String jenis = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();

        String hasil = pesanTiket(jenis, jumlah);
        System.out.println(hasil);

        scanner.close(); // Menutup scanner untuk mencegah kebocoran resource
    }
}
