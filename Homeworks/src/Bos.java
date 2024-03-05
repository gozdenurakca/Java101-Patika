import java.util.Scanner;

public class Bos {

    static int power(int base, int exp)
    {
        int result = 1;
        for(int i = 1; i <= exp; i++)
        {
            result *= base;
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("Taban sayısı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("Üs sayısı giriniz: ");
        sayi2 = input.nextInt();

        int case1 = power(sayi1,sayi2);
        System.out.println("Sonuç : " + case1);

        System.out.println(power(3,4));



    }
}
