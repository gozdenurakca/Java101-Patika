import java.util.Scanner;

/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173

 */
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo, boy,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        sonuc = (kilo / (boy * boy));
        System.out.print("Vücut Kitle İndeksiniz :" +sonuc);

    }
}
