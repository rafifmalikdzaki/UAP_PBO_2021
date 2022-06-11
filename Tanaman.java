package LatihanUAP;

public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;
    private String nama;

    public abstract void berkembang();

    public String status() {
        return lamaHidup >= masaHidup ? "Mati" : "Hidup";
    }

    public String toString() {
        String temp = String.format("%-30s: %d hari\n%-30s: %d hari\n%-30s: %d buah %s\n%-30s: %s\n", "Masa Hidup",
                this.masaHidup, "Umur tanaman", this.lamaHidup, "Menghasilkan", this.buah, this.nama, "Status",
                this.status());
        return temp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public int getBuah() {
        return buah;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

}
