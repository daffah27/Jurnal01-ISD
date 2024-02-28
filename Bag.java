class Bag {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // Getter dan setter
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", stok=" + stok +
                '}';
    }
}