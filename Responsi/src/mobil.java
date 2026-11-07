public class mobil extends kendaraan implements perawatan, fiturGPS {
    private int jumlahPintu;
    private int jumlahTempatDuduk;

    public mobil(String nomorRangka, String merk, int jumlahPintu, int jumlahTempatDuduk) {
        super(nomorRangka, merk);
        this.jumlahPintu = jumlahPintu;
        this.jumlahTempatDuduk = jumlahTempatDuduk;
    }
    public void jalankanKendaraan() {
        if (this.isMesinMenyala()) {
            this.setKecepatan(this.getKecepatan() + 20);
            System.out.println("Mobil melaju, kecepatan saat ini adalah " + this.getKecepatan() + " km/jam.");
        } else {
            System.out.println("Mesin mobil belum menyala.");
        }
    }
    public void cetakInformasiDasar() {
        super.cetakInformasiDasar();
        System.out.println("Jumlah pintu mobil ini adalah " + this.jumlahPintu + " dan jumlah tempat duduk mobil ini adalah " + this.jumlahTempatDuduk);
    }
    public void lakukanService() {
        System.out.println("Melakukan service pada mobil, ganti oli dan cek rem.");
    }
    public String dapatkanKoordinatGPS() {
        return "Garis Lintang: -6.7, Garis Bujur: 100.0";
    }
}