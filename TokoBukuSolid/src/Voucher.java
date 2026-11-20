public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher Rp" + String.format("%,d", nilai).replace(',', '.');
    }

    /*
     * Versi melanggar LSP (dijalankan pada uji coba awal):
     * @Override
     * public int totalBayar(int totalBelanja) {
     *     return totalBelanja - nilai;
     * }
     *
     * Bukti kesalahan pada Keranjang Kedua (Total Belanja Rp64.000):
     * Voucher Rp100.000    : Rp-36.000 (bernilai negatif, melanggar kontrak totalBayar)
     */

    @Override
    public int totalBayar(int totalBelanja) {
        // Perbaikan patuh kontrak LSP (hasil tidak pernah di bawah nol)
        return Math.max(0, totalBelanja - nilai);
    }
}