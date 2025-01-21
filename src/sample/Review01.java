package sample;

public class Review01 {
    public static void main(String[] args) {

//        商品の価格
        int merchandise = 1500;
//        税率
        int taxRate = 10;

        int result = tax(merchandise, taxRate);
        int priceIncludingTax = merchandise + result;

        System.out.println(merchandise + "円の商品の税込み価格は" + priceIncludingTax + "円(消費税は" + result + "円)です。");

    }

    public static int tax(int num1, int num2) {
        int result = (int) (num1 * (num2 / 100.0));
        return result;
    }
}