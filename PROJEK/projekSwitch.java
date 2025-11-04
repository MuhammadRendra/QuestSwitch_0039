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
        System.out.println("Ipk: " + ipk);
        System.out.println("Predikat: " + Predikat);

        if (Predikat.equals("A (Sangat Baik)") || Predikat.equals("AB (Baik Sekali)")) {
            System.out.println("Selamat Anda Memenuhi Syarat Untuk Mendaftar Sebagai Asdos");
            System.out.println("Pilih Salah 1 Matkul yang Ingin Diajukan Sebagai Asdos");
            System.out.println("Daftar Mata Kuliah yang Dapat Diajukan");
            System.out.println("1.Struktur Data");
            System.out.println("2.Pemrograman Berorientasi Objek");
            System.out.println("3.Basis Data");
            System.out.println("4.Algoritma dan Pemrograman");
            System.out.println("5.Rekayasa Perangkat Lunak");

            int pilihan = qs.nextInt();
            double nilaiPilihan = 0;

            switch (pilihan) {
                case 1:
                    nilaiPilihan = strukdat;
                    break;
                case 2:
                    nilaiPilihan = PBO;
                    break;
                case 3:
                    nilaiPilihan = algopem;
                    break;
                case 4:
                    nilaiPilihan = strukdat;
                    break;
                case 5:
                    nilaiPilihan = repelu;
                    break;
                default:
                    System.out.println("pilihan Tidak Valid");
                    System.exit(0);

            }

            if (nilaiPilihan >= 75) {
                System.out.println("Selamat Anda Dinyatakan Eligible Untuk Menjadi Asdos Pada Matkul yang Dipilih");
            } else {
                System.out.println("Maaf Anda Belum Memenuhi Syarat Untuk Menjadi Asdos Pada Matkul yang Dipilih");
            }
            qs.close();
        }
    }
}
