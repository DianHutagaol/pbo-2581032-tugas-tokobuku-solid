public class BukuCetak extends Buku {
    private int beratGram;
    private int ongkir;

    public BukuCetak(String judul, String penulis, int harga, int beratGram, int ongkir) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
        this.ongkir = ongkir;
    }

    @Override
    public int hitungHargaAkhir() {
        return harga + ongkir;
    }

    @Override
    public String getKeterangan() {
        return beratGram + " gram, ongkir Rp" + String.format("%,d", ongkir).replace(',', '.');
    }
}

