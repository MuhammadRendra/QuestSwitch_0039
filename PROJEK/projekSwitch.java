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

    }
}
