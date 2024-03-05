import java.util.Scanner;

public class SinifiGecmeDurumu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat, fizik, kimya, turkce, muzik, toplam = 0.0, sayim = 0, ortalama;

        System.out.print("Matematik notunu giriniz :");
        mat = input.nextDouble();
        if(mat >= 0 && mat <= 100)
        {
            toplam += mat;
            sayim++;
        }
        System.out.print("Fizik notunu giriniz :");
        fizik = input.nextDouble();
        if(fizik >= 0 && fizik <= 100)
        {
            toplam += fizik;
            sayim++;
        }
        System.out.print("Kimya notunu giriniz :");
        kimya = input.nextDouble();
        if(kimya >= 0 && kimya <= 100)
        {
            toplam += kimya;
            sayim++;
        }
        System.out.print("Türkçe notunu giriniz :");
        turkce = input.nextDouble();
        if(turkce >= 0 && turkce <= 100)
        {
            toplam += turkce;
            sayim++;
        }
        System.out.print("Müzik notunu giriniz :");
        muzik = input.nextDouble();
        if(muzik >= 0 && muzik <= 100)
        {
            toplam += muzik;
            sayim++;
        }

        ortalama = toplam/sayim;
        System.out.println("Ortalamanız : " + ortalama);

        if(ortalama >= 55 && ortalama <= 100)
        {
            System.out.println("Tebrikler, sınıfı geçtiniz!!");
        } else {
            System.out.println("Maalesef sınıf tekrarı yapacaksınız !!");
        }
    }
}