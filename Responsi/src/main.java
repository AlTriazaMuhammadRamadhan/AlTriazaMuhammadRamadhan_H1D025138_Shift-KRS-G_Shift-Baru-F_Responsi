public class main {
    public static void main(String[] args) {
        System.out.println("Mobil untuk di service masuk.");
        mobil toyotaAvanza = new mobil("TYT-123", "Toyota", 4, 7);
        toyotaAvanza.cetakInformasiDasar();
        toyotaAvanza.jalankanKendaraan();
        toyotaAvanza.nyalakanMesin();
        toyotaAvanza.jalankanKendaraan();

        System.out.println("Motor untuk di service masuk.");
        motor hondaVario = new motor("VRO-321", "Honda", "Matic", 2);
        hondaVario.cetakInformasiDasar();
        hondaVario.nyalakanMesin();
        hondaVario.jalankanKendaraan();

        System.out.println("Mobil untuk di cek sistem navigasinya masuk.");
        fiturGPS hondaBrio = new mobil("BRO-456", "Brio", 4, 5);
        System.out.println("Posisi saat ini adalah: " + hondaBrio.dapatkanKoordinatGPS());

        perawatan yamahaTricity = new motor("TCY-654", "Yamaha", "Matic", 3);
        yamahaTricity.lakukanService();
    }
}