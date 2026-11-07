public abstract class kendaraan {
    public static final String jenisBbmStandar = "Pertamax";
    private final String nomorRangka;
    private String merk;
    private int kecepatan;
    private boolean mesinMenyala;

    public kendaraan(String nomorRangka, String merk) {
        this.nomorRangka = nomorRangka;
        this.merk = merk;
        this.kecepatan = 0;
        this.mesinMenyala = false;
    }
    public kendaraan(String nomorRangka) {
        this.nomorRangka = nomorRangka;
        this.merk = "Tidak diketahui.";
        this.kecepatan = 0;
        this.mesinMenyala = false;
    }
    public String getMerk() {
        return this.merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public int getKecepatan() {
        return this.kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public boolean isMesinMenyala() {
        return this.mesinMenyala;
    }
    public void nyalakanMesin() {
        this.mesinMenyala = true;
        System.out.println("Mesin kendaraan " + this.merk + " menyala");
    }
    public String getNomorRangka() {
        return this.nomorRangka;
    }
    public void cetakInformasiDasar() {
        System.out.println("Merknya adalah " + this.merk + " dengan nomor rangka " + this.nomorRangka);
    }
    public abstract void jalankanKendaraan();
}
