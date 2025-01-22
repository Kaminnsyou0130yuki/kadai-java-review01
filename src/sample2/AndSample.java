package sample2;

public class AndSample {

    public static void main(String[] args) {
        int scoreSansu = 80;
        int scoreKokugo = 80;

        if(scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格");
        } else if(scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数もしくは国語のいずれかが不合格です");
        } else {
            System.out.println("補講対象です");
        }

    }

}
