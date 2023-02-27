package Lecturer;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        float[][] data = {
                { 15, 10, 1 },
                { -10, 15, 2 },
                { 10, -10, 1 },
                { -15, -5, 3 },
                { -5, 5, 2 }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan attribute ke-1: ");
        float input1 = scanner.nextFloat();
        System.out.print("Masukkan attribute ke-2: ");
        float input2 = scanner.nextFloat();
        scanner.close();
        float minDistance = Float.MAX_VALUE;
        float result = 0;
        for (int i = 0; i < data.length; i++) {
            float distance = (float) Math.sqrt(Math.pow(input1 - data[i][0], 2) + Math.pow(input2 - data[i][1], 2));
            if (distance < minDistance) {
                minDistance = distance;
                result = data[i][2];
            }
        }
        System.out.println("Attribute ke-3 dari data yang baru: " + result);

    }
}
