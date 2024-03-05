public class Bos3 {

    static int f(int x)
    {
        int result = 0;
        for(int i = 1; i <= x; i++)
        {
            result += i;
        }
        return result;
    }

    static int r(int n) {
        System.out.println("n değeri => " + n);
        if (n == 1)
        {
            return 1;
        }
        int result = r(n-1) + n;
        System.out.println("Sonuç : " + result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Toplam : " + f(10));
        r(10);

    }
}
