public class StrukPrinter {
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println("=========== " + judul + " ===========");
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga      : Rp" + String.format("%,d", b.getHarga()).replace(',', '.'));
            System.out.println("  Keterangan : " + b.getKeterangan());
            System.out.println("  Harga akhir : Rp" + String.format("%,d", b.hitungHargaAkhir()).replace(',', '.'));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : Rp" + String.format("%,d", keranjang.hitungTotal()).replace(',', '.'));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar mb : pilihan) {
            String nominalStr = "Rp" + String.format("%,d", mb.totalBayar(totalBelanja)).replace(',', '.');
            System.out.printf("%-20s : %s\n", mb.nama(), nominalStr);
        }
    }
}