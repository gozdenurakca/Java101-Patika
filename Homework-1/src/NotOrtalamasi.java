
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik sınav notlarınızı sırasıyla giriniz: ");
        int mat1 = input.nextInt();
        int mat2 = input.nextInt();
        int mat3 = input.nextInt();
        int matOrt = (mat1 + mat2 + mat3) / 3;
        System.out.println("Matematik Ortalaması : " + matOrt);
        String sonuc1 = (matOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc1);


        System.out.print("Lütfen Fizik sınav notlarınızı sırasıyla giriniz: ");
        int fizik1 = input.nextInt();
        int fizik2 =   input.nextInt();
        int fizik3 = input.nextInt();
        int fizikOrt = (fizik1 + fizik2 + fizik3) / 3;
        System.out.println("Fizik Ortalaması : " + fizikOrt);
        String sonuc2 = (fizikOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc2);


        System.out.print("Lütfen Kimya sınav notlarınızı sırasıyla giriniz: ");
        int kimya1 = input.nextInt();
        int kimya2 = input.nextInt();
        int kimya3 = input.nextInt();
        int kimyaOrt = (kimya1 + kimya2 + kimya3) / 3;
        System.out.println("Kimya Ortalaması : " + kimyaOrt);
        String sonuc3 = (kimyaOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc3);

        System.out.print("Lütfen Türkçe sınav notlarınızı sırasıyla giriniz: ");
        int tr1 = input.nextInt();
        int tr2 = input.nextInt();
        int tr3 = input.nextInt();
        int trOrt = (tr1 + tr2 + tr3) / 3;
        System.out.println("Türkçe Ortalaması : " + trOrt);
        String sonuc4 = (trOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc4);

        System.out.print("Lütfen Tarih sınav notlarınızı sırasıyla giriniz: ");
        int tarih1 = input.nextInt();
        int tarih2 = input.nextInt();
        int tarih3 = input.nextInt();
        int tarihOrt = (tarih1 + tarih2 + tarih3) / 3;
        System.out.println("Tarih Ortalaması : " + tarihOrt);
        String sonuc5 = (tarihOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc5);

        System.out.print("Lütfen Müzik sınav notlarınızı sırasıyla giriniz: ");
        int muzik1 = input.nextInt();
        int muzik2 = input.nextInt();
        int muzik3 = input.nextInt();
        int muzikOrt = (muzik1 + muzik2 + muzik3) / 3;
        System.out.println("Müzik Ortalaması : " + muzikOrt);
        String sonuc6 = (muzikOrt > 60) ? "Sınıfı Geçti " : "Sınıfta Kaldı";
        System.out.println(sonuc6);




    }
}
