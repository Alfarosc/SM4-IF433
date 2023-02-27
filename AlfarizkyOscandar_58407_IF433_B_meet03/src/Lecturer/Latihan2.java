package Lecturer;

public class Latihan2 {
    public static void main(String[] args) {
        double[] tinggi_badan = new double[10];
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

        float rata_rata = 0;
        for (int i = 0; i < tinggi_badan.length; i++) {
            rata_rata += tinggi_badan[i];
        }
        rata_rata /= tinggi_badan.length;

        System.out.println("Rata-rata : " + rata_rata);

        float std_dev = 0;
        for (int i = 0; i < tinggi_badan.length; i++) {
            std_dev += Math.pow(tinggi_badan[i] - rata_rata, 2);
        }
        std_dev /= tinggi_badan.length;
        std_dev = (float) Math.sqrt(std_dev);

        System.out.println("Standar Deviasi : " + std_dev);

    }
}
