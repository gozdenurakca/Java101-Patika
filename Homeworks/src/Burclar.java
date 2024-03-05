/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Lütfen doğdunuz ayın sayısını giriniz : ");
        month = input.nextInt();
        System.out.print("Lütfen doğdunuz günü giriniz : ");
        day = input.nextInt();

        if(month == 1)
        {
            if(day <= 21)
            {
                System.out.println("Burcunuz Oğlaktır.");
            } else {
                System.out.println("Burcunuz Kovadır.");
            }
        } else if(month == 2) {
            if(day <= 19) {
                System.out.println("Burcunuz Kovadır.");
            } else {
                System.out.println("Burcunuz Balıktır.");
            }
        } else if(month == 3) {
            if(day <= 20) {
                System.out.println("Burcunuz Balıktır.");
            } else {
                System.out.println("Burcunuz Koçtur");
            }
        } else if(month == 4) {
            if(day <= 20) {
                System.out.println("Burcunuz Koçtur.");
            } else {
                System.out.println("Burcunuz Boğadır.");
            }
        } else if (month == 5) {
            if(day <= 21) {
                System.out.println("Burcunuz Boğadır.");
            } else {
                System.out.println("Burcunuz İkizlerdir.");
            }
        } else if (month == 6) {
            if (day <= 22)
            {
                System.out.println("Burcunuz İkizlerdir.");
            } else {
                System.out.println("Burcunuz Yengeçtir.");
            }
        } else if (month == 7) {
            if (day <= 22)
            {
                System.out.println("Burcunuz Yengeçtir.");
            } else {
                System.out.println("Burcunuz Aslandır.");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Burcunuz Aslandır.");
            } else {
                System.out.println("Burcunuz Başaktır.");
            }
        } else if (month == 9) {
            if (day <= 22)
            {
                System.out.println("Burcunuz Başaktır.");
            } else {
                System.out.println("Burcunuz Terazidir.");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Burcunuz Terazidir.");
            } else {
                System.out.println("Burcunuz Akreptir.");
            }
        } else if (month == 11) {
            if (day <= 22) {
                System.out.println("Burcunuz Akreptir.");
            } else {
                System.out.println("Burcunuz Yaydır.");
            }
        } else if (month == 12) {
            if (day <= 21)
            {
                System.out.println("Burcunuz Yaydır.");
            } else {
                System.out.println("Burcunuz Oğlaktır.");
            }
        } else
            System.out.println("Olmayan bir sayı girdiniz. Lütfen tekrar deneyiniz.");
    }
}