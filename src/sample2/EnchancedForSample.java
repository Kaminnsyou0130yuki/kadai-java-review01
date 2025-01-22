package sample2;

public class EnchancedForSample {

    public static void main(String[] args) {
        int[] score = {47, 55, 88, 100, 74};
        int sum = 0;
        double average = 0.0;


//        For文
//        for(int i = 0; i < score.length; i++) {
//            sum = sum + score[i];
//        }

//        拡張For文
        for(int data : score) {
            sum = sum + data;
        }

        average = (double) sum / score.length;

        System.out.println("合計点：" + sum + "平均点：" + average);
    }

}
