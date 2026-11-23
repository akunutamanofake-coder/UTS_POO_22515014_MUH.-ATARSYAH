import java.util.ArrayList;

public class Kampus {
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<Matakuliah> daftarMatakuliah;
    private Queue antreanKrs;

    public Kampus() {
        daftarMahasiswa = new ArrayList<>();
        daftarMatakuliah = new ArrayList<>();
        antreanKrs = new Queue();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tambahMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public void ajukanKrs(Krs krs) {
        antreanKrs.enqueue(krs);
    }

    public void tampilkanMahasiswa() {
        System.out.println("\n=== DATA MAHASISWA ===");

        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
            System.out.println("----------------------");
        }
    }

    public void tampilkanMatakuliah() {
        System.out.println("\n=== DATA MATA KULIAH ===");

        for (Matakuliah m : daftarMatakuliah) {
            m.tampilkanData();
            System.out.println("----------------------");
        }
    }

    public void tampilkanAntrean() {
        antreanKrs.tampilkanAntrean();
    }

    public void prosesKrs() {
        Krs krs = antreanKrs.dequeue();

        if (krs != null) {
            System.out.println("\nKRS BERHASIL DIPROSES!");
            krs.tampilkanKrs();
        }
    }
}