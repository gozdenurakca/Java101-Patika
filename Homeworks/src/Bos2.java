public class Bos2 {
    static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        int result = sum(5,5) + sum(3,3);
        System.out.println(result);

        sum2(5,6);
    }

    static void sum2(int number1, int number2)
    {
        int result = number1 + number2;
        System.out.println("Sonuç : " + result);
        return;
    }
}
