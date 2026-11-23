public class Krs {
    private Mahasiswa mahasiswa;
    private Matakuliah matakuliah;

    public Krs(Mahasiswa mahasiswa, Matakuliah matakuliah) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void tampilkanKrs() {
        System.out.println("NIM Mahasiswa : " + mahasiswa.getNim());
        System.out.println("Nama          : " + mahasiswa.getNama());
        System.out.println("Mata Kuliah   : " + matakuliah.getNama());
        System.out.println("SKS           : " + matakuliah.getSks());
    }
}