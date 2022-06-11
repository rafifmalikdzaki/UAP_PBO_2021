package LatihanUAP;

import java.util.*;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masa tanam (bulan) : ");
        int N = in.nextInt() * 30;

        menanam();
        menanam();
        menanam();

        System.out.println("\n\n--------------- Proses Perkembangan ---------------\n\n");

        for (int i = 1; i <= N; i++) {
            if (i % 90 == 0) {
                System.out.println("\n--------------- Proses Perawatan ---------------\n");
            }
            int size = tanamans.size();
            for (int j = 0; j < size; j++) {
                Tanaman tanaman = tanamans.get(j);
                int index = tanamans.indexOf(tanaman);
                String status = tanaman.status();
                if (status.equals("Hidup")) {
                    tanaman.berkembang();
                }

                else if (lokasi.contains(index)) {
                    continue;
                }

                else if (status.equals("Mati")) {
                    lokasi.add(index);
                    System.out.printf("Tanaman %s telah mati.\n", tanaman.getNama());
                    menanam();
                    Tanaman temp = tanamans.get(tanamans.size() - 1);
                    temp.berkembang();
                }

                if (i % 90 == 0 && !lokasi.contains(index)) {
                    if (tanaman instanceof Tomat) {
                        ((Tomat) tanaman).treatment();
                    } else if (tanaman instanceof Stroberi) {
                        ((Stroberi) tanaman).treatment();
                    } else if (tanaman instanceof Persik) {
                        ((Persik) tanaman).treatment();
                    }
                }
            }
        }
    }

    public static void menanam() {
        System.out.println("Mau menanam apa ?");
        System.out.println("1. Tomat\n2. Stroberi\n3. Persik");
        String nama = "Buah";
        switch (in.nextInt()) {
            case 1:
                tanamans.add(new Tomat());
                nama = "Tomat";
                break;
            case 2:
                tanamans.add(new Stroberi());
                nama = "Stroberi";
                break;
            case 3:
                tanamans.add(new Persik());
                nama = "Persik";
                break;
            default:
                System.out.println("Salah Input");
                menanam();
                return;
        }
        System.out.printf("%s berhasil ditanam.\n", nama);
    }

    public static void info() {
        System.out.println("\n--------------- Hasil Menanam ---------------\n");
        int index = 1;
        for (Tanaman tanaman : tanamans) {
            System.out.print("Tanaman ke-" + index++ + "\n" + tanaman + "\n");
            // System.out.printf("Perkembangan Akhir: %.0f %%\n\n",
            // (tanaman.getPerkembangan() * 100));

        }
    }
}
