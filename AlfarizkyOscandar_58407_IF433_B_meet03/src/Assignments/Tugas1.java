package Assignments;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        float[] tinggi_badan = new float[10];

        // Isi array dengan nilai antara 145-180
        tinggi_badan[0] = 145;
        tinggi_badan[1] = 150;
        tinggi_badan[2] = 155;
        tinggi_badan[3] = 160;
        tinggi_badan[4] = 168;
        tinggi_badan[5] = 170;
        tinggi_badan[6] = 173;
        tinggi_badan[7] = 174;
        tinggi_badan[8] = 175;
        tinggi_badan[9] = 180;

        // Hitung rata-rata
        float total = 0;
        for (float tinggi : tinggi_badan) {
            total += tinggi;
        }
        float rata_rata = total / tinggi_badan.length;

        // Hitung standar deviasi
        float total_jarak_kuadrat = 0;
        for (float tinggi : tinggi_badan) {
            float jarak = tinggi - rata_rata;
            total_jarak_kuadrat += jarak * jarak;
        }
        float std_dev = (float) Math.sqrt(total_jarak_kuadrat / tinggi_badan.length);

        // OUTPUT
        System.out.println("Tinggi badan: " + Arrays.toString(tinggi_badan));
        System.out.println("Rata-rata: " + rata_rata);
        System.out.println("Standar deviasi: " + std_dev);

	}
}
