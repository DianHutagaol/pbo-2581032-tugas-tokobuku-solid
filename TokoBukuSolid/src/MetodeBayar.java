// Kontrak totalBayar: hasilnya tidak pernah negatif.
public interface MetodeBayar {
    String nama();
    int totalBayar(int totalBelanja);
}