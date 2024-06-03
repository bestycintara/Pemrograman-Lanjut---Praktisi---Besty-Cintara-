package tugas;
import java.util.*;

public class rumahSakit {
    public static void main(String[] args) {
        Queue<String> namaPasien = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Silahkan tulis nama pasien: ");
                String nama = input.nextLine();
                if (nama == null || nama.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama pasien tidak boleh kosong!");
                }
                namaPasien.offer(nama);

                System.out.println();
                System.out.println("Berhenti input? (X to stop)");
                String stopInput = input.nextLine();
                if (stopInput.equalsIgnoreCase("X")) {
                    break;
                }
            }

            // Pasien yang telah terdata
            namaPasien.offer("Besty Cintara");
            namaPasien.offer("Laura Nesya");
            namaPasien.offer("Kintan Azzahrah");

            // Output Nama Pasien
            System.out.println("Nama Pasien dalam antrian:");
            int i = 1;

            for (String next = namaPasien.poll(); next != null; next = namaPasien.poll()) {
                System.out.print(i + ") ");
                System.out.println(next);
                i++;
            }
    }
}