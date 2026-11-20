public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getHarga() { return harga; }

    public abstract int hitungHargaAkhir();
    public abstract String getKeterangan();
}
