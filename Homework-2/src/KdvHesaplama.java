/*
Pratik - KDV Tutarı Hesaplayan Program

KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
 KDV tutarı hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, kdvTutar, kdvliTutar;
        System.out.print("Ücreti giriniz: ");
        tutar = input.nextDouble();
        if(tutar>= 0 && tutar <= 1000)
        {
            kdvOrani = 0.18;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz tutar: " +tutar);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDV'li tutar: " + kdvliTutar);

        } else if (tutar > 1000 ) {
            kdvOrani = 0.8;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz tutar: " +tutar);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDV'li tutar: " + kdvliTutar);
        }
    }
}
