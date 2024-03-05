import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, choose;
        System.out.print("Birinci sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşleminizin numarasını seçiniz : ");
        choose = input.nextInt();

        switch (choose)
        {
            case 1:
                System.out.println("Sonuç : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Sonuç : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Sonuç : " + (number1 * number2));
                break;
            case 4:
                if(number2 != 0) {
                    System.out.println("Bölme : " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı 0' a bölünemez, başka bir sayı giriniz");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz..");
                break;
        }
    }
}