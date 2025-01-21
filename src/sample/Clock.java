package sample;

public class Clock {

    public static void main(String[] args) {
        int hour = 18;
        int min = 32;
        int sec = 47;

        int result = getSeconds(hour, min, sec);
        System.out.println("結果：" + result + "秒");
    }

    public static int getSeconds(int num1, int num2, int num3) {
        int result = num1 * 3600 + num2 * 60 + num3;
        return result;
    }
}
