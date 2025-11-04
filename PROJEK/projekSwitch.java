package PROJEK;

import java.util.Scanner;

public class projekSwitch {
    public static void main(String[] args) {
        Scanner qs = new Scanner(System.in);

        System.out.println("Nilai Matkul");

        double strukdat, PBO, basdat, algopem, repelu, mean;

        System.out.println("Masukkan Nilai Struktur Data: ");
        strukdat = qs.nextDouble();
        System.out.println("Masukkan Nilai Pemrograman Berorientasi Objek: ");
        PBO = qs.nextDouble();
        System.out.println("Masukkan Nilai Basis Data: ");
        basdat = qs.nextDouble();
        System.out.println("Masukkan Nilai Algoritma dan Pemrograman: ");
        algopem = qs.nextDouble();
        System.out.println("Masukkan Nilai Rekayasa Perangkat Lunak: ");
        repelu = qs.nextDouble();

        mean = (strukdat + PBO + basdat + algopem + repelu) / 5;
        String Predikat;
        double ipk;
        ipk = mean / 25;

        if (ipk >= 3.75 && ipk >= 4) {
            Predikat = "A (Sangat Baik)";
        } else if (ipk >= 3.50 && ipk < 3.75) {
            Predikat = "AB (Baik Sekali)";
        } else if (ipk >= 3.00 && ipk < 3.50) {
            Predikat = "B (Baik)";
        } else if (ipk >= 2.50 && ipk < 3.00) {
            Predikat = "Predikat BC (Cukup)";
        } else {
            Predikat = "C (Kurang)";
        }

        System.out.println("Nilai Rata-Rata: " + mean);

    }
}
