public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;
    private int diskonPersen;
    private String urlUnduh;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB, int diskonPersen, String urlUnduh) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
        this.diskonPersen = diskonPersen;
        this.urlUnduh = urlUnduh;
    }

    @Override
    public String getUrlUnduh() { return urlUnduh; }

    @Override
    public int hitungHargaAkhir() {
        return harga - (harga * diskonPersen / 100);
    }

    @Override
    public String getKeterangan() {
        return ukuranMB + " MB, diskon " + diskonPersen + "%";
    }
}
