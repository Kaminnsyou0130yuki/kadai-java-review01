package sample2;

public class IfSample1 {

    public static void main(String[] args) {
        int score = 80;

//        if(score >= 60) {
//            System.out.println("合格です！");
//        } else {
//            System.out.println("不合格です！");
//        }



//        String result = (score >= 60) ? "合格です！" : "不合格です！";
////        True時に合格、False時に不合格と表示される
//
//        System.out.println(result);


        if(score == 100) {
            System.out.println("満点です");
        } else if(score >= 80) {
            System.out.println("よくできました");
        } else if(score >= 60) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }

//        if(score == 100) {
//            System.out.println("満点です");
//        } else if(score >= 80 && score <= 99) {
//            System.out.println("よくできました");
//        } else if(score >= 60 && score <=79) {
//            System.out.println("合格です");
//        } else {
//            System.out.println("不合格です");
//        }


    }
}
