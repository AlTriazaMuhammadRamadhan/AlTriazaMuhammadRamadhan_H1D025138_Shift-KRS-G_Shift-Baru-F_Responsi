public class motor extends kendaraan implements perawatan {
    private String tipeMotor;
    private int jumlahRoda;
    public motor(String nomorRangka, String merk, String tipeMotor, int jumlahRoda) {
        super(nomorRangka, merk);
        this.tipeMotor = tipeMotor;
        this.jumlahRoda = jumlahRoda;
    }
    public void jalankanKendaraan() {
        if(this.isMesinMenyala()) {
            this.setKecepatan(this.getKecepatan() + 20);
            System.out.println("Motor melaju, kecepatan saat ini adalah " + this.getKecepatan() + " km/jam.");
        } else {
            System.out.println("Mesin motor belum menyala.");
        }
    }
    public void cetakInformasiDasar() {
        super.cetakInformasiDasar();
        System.out.println("Tipe motor adalah " + this.tipeMotor);
    }
    public void lakukanService() {
        System.out.println("Melakukan service pada motor, cek rantai dan cek busi.");
    }
}