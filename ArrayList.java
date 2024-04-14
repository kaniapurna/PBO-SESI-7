package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Kania");
        nama.add("Purnarahayu");
        nama.add("Ayu");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Ayu");

        boolean adaPurnarahayu = nama.contains("Purnarahayu");

        System.out.println("Apakah ada Purnarahayu? " + adaPurnarahayu);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}