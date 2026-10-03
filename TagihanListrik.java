import java.util.Scanner;

public class TagihanListrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int JUMLAH_BULAN = 12;
        final int BATAS_HEMAT_KWH = 100;
        final double TARIF_HEMAT = 1000.0;   // Rp per kWh
        final double TARIF_NORMAL = 1500.0;  // Rp per kWh

        double totalTagihanSetahun = 0;

        System.out.println("=== PROGRAM PERHITUNGAN TAGIHAN LISTRIK 12 BULAN ===");

        for (int bulan = 1; bulan <= JUMLAH_BULAN; bulan++) {

            System.out.print("\nMasukkan pemakaian listrik bulan ke-" + bulan + " (kWh): ");
            double pemakaianKWh = input.nextDouble();

            double biayaBulanIni;
            String keteranganTarif;

            if (pemakaianKWh > BATAS_HEMAT_KWH) {
                biayaBulanIni = pemakaianKWh * TARIF_NORMAL;
                keteranganTarif = "Tarif Normal (Rp1.500/kWh)";
            } else {
                biayaBulanIni = pemakaianKWh * TARIF_HEMAT;
                keteranganTarif = "Tarif Hemat (Rp1.000/kWh)";
            }

            totalTagihanSetahun += biayaBulanIni;

            System.out.printf("Bulan %2d | %-28s | Biaya: Rp%,.0f%n",
                    bulan, keteranganTarif, biayaBulanIni);
        }

        System.out.println("\n===================================================");
        System.out.printf("TOTAL TAGIHAN LISTRIK SELAMA 12 BULAN: Rp%,.0f%n", totalTagihanSetahun);
        System.out.println("===================================================");

        input.close();
    }
}