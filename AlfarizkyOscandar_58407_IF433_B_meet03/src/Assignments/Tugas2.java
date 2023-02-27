package Assignments;
import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        float[][] data = {
            {15, 10, 1},
            {-10, 15, 2},
            {10, -10, 1},
            {-15, -5, 3},
            {-5, 5, 2}
        };

        // INPUT
        Scanner thiScanner = new Scanner(System.in);
        System.out.print("Masukkan nilai attribute ke-1: ");
        float attr1 = thiScanner.nextFloat();
        System.out.print("Masukkan nilai attribute ke-2: ");
        float attr2 = thiScanner.nextFloat();

        // Hitung jarak
        float min_jarak = Float.MAX_VALUE;
        int index_min_jarak = -1;
        for (int i = 0; i < data.length; i++) {
            float jarak = (float) Math.sqrt(Math.pow(attr1 - data[i][0], 2) + Math.pow(attr2 - data[i][1], 2));
            if (jarak < min_jarak) {
                min_jarak = jarak;
                index_min_jarak = i;
            }
        }

        // OUTPUT
        System.out.println("Data terdekat adalah data ke-" + (index_min_jarak+1));
        System.out.println("Jarak dari data baru: " + min_jarak);
        System.out.println("Nilai attribute ke-3 dari data terdekat: " + data[index_min_jarak][2]);

	}
 
}
