import java.util.Scanner;

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Taksimetre {
    public static void main(String[] args) {
        int acilisUcreti = 10, minTutar = 20;
        double perKM = 2.20, toplamTutar,gidilenMesafe,total;

        Scanner input = new Scanner(System.in);
        System.out.print("Taksiyle toplam kaç km mesafe gittiğinizi yazın.");
        gidilenMesafe = input.nextDouble();

        toplamTutar = acilisUcreti + gidilenMesafe*perKM;
        total = (toplamTutar < 20 ) ? 20 : toplamTutar;

        System.out.println(total + " TL borcunuz var");

    }
}
