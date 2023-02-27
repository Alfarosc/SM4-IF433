package Lecturer;

public class Latihan1 {
    public static void main(String[] args){
        int[] list_score = {10,20,30,40,50,60,70,80,90,100};
        
        
        int min = list_score[0];
        int max = list_score[0];
        
        for(int i = 0; i <= 9; i++){
            if(list_score[i]<min){
                min = list_score[i];
            }
            if(list_score[i]>max){
                max = list_score[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
