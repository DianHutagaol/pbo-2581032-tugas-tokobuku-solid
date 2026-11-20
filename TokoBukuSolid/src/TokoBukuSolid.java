public class TokoBukuSolid {
    public static void main(String[] args) {
        // Keranjang Pertama (Total Rp348.000)
        Keranjang k1 = new Keranjang();
        k1.tambah(new BukuCetak("Pemrograman Java", "John Doe", 120000, 750, 10000));
        k1.tambah(new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400, 5000));
        k1.tambah(new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 20, "https://example.com/oop"));
        k1.tambah(new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240, 10));

        // Keranjang Kedua (Total Rp64.000)
        Keranjang k2 = new Keranjang();
        k2.tambah(new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 20, "https://example.com/oop"));

        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", k1);
        printer.cetakPembayaran(k1.hitungTotal(), pilihan);

        System.out.println();

        printer.cetakKeranjang("KERANJANG KEDUA", k2);
        printer.cetakPembayaran(k2.hitungTotal(), pilihan);
    }
}