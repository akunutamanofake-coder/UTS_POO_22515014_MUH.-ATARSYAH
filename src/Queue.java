import java.util.LinkedList;

public class Queue {
    private LinkedList<Krs> antrean;

    public Queue() {
        antrean = new LinkedList<>();
    }

    public void enqueue(Krs krs) {
        antrean.addLast(krs);
        System.out.println("KRS berhasil masuk antrean!");
    }

    public Krs dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean masih kosong!");
            return null;
        }

        return antrean.removeFirst();
    }

    public boolean isEmpty() {
        return antrean.isEmpty();
    }

    public void tampilkanAntrean() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
            return;
        }

        System.out.println("=== DAFTAR ANTREAN KRS ===");

        for (Krs krs : antrean) {
            System.out.println("----------------------");
            krs.tampilkanKrs();
        }
    }
}