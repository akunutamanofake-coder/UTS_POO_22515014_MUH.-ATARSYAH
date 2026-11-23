import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kampus kampus = new Kampus();

        // Data mahasiswa
        Mahasiswa m1 = new Mahasiswa("22515001", "Andi", "Sistem Informasi");
        Mahasiswa m2 = new Mahasiswa("22515002", "Bdi", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("22515003", "Citra", "Sistem Informasi");

        kampus.tambahMahasiswa(m1);
        kampus.tambahMahasiswa(m2);
        kampus.tambahMahasiswa(m3);

        Mahasiswa[] mahasiswa = {m1, m2, m3};

        Matakuliah mk1 = new Matakuliah("MK001", "Pemrograman Java", 3);
        Matakuliah mk2 = new Matakuliah("MK002", "Struktur Data", 3);
        Matakuliah mk3 = new Matakuliah("MK003", "Basis Data", 2);

        kampus.tambahMatakuliah(mk1);
        kampus.tambahMatakuliah(mk2);
        kampus.tambahMatakuliah(mk3);

        Matakuliah[] matakuliah = {mk1, mk2, mk3};

        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("       SISTEM AKADEMIK MINI");
            System.out.println("================================");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Mata Kuliah");
            System.out.println("3. Ajukan KRS");
            System.out.println("4. Tampilkan Antrean KRS");
            System.out.println("5. Proses Antrean KRS");
            System.out.println("0. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    kampus.tampilkanMahasiswa();
                    break;

                case 2:
                    kampus.tampilkanMatakuliah();
                    break;

                case 3:
                    System.out.println("\nPilih Mahasiswa:");

                    for (int i = 0; i < mahasiswa.length; i++) {
                        System.out.println((i + 1) + ". " +
                                mahasiswa[i].getNama());
                    }

                    System.out.print("Nomor Mahasiswa: ");
                    int pilihMahasiswa = input.nextInt();

                    System.out.println("\nPilih Mata Kuliah:");

                    for (int i = 0; i < matakuliah.length; i++) {
                        System.out.println((i + 1) + ". " +
                                matakuliah[i].getNama());
                    }

                    System.out.print("Nomor Mata Kuliah: ");
                    int pilihMatakuliah = input.nextInt();

                    if (pilihMahasiswa >= 1 && pilihMahasiswa <= 3 &&
                            pilihMatakuliah >= 1 && pilihMatakuliah <= 3) {

                        Krs krs = new Krs(
                                mahasiswa[pilihMahasiswa - 1],
                                matakuliah[pilihMatakuliah - 1]
                        );

                        kampus.ajukanKrs(krs);

                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 4:
                    kampus.tampilkanAntrean();
                    break;

                case 5:
                    kampus.prosesKrs();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}