import java.util.Scanner;
/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sicaklik;

        System.out.print("Lütfen sıcaklık değerini giriniz : ");
        sicaklik = input.nextFloat();

       if(sicaklik < 5) {
           System.out.println("Kayak yapabilirsin.");
       } else if(sicaklik>= 5 && sicaklik <= 25) {
           if (sicaklik >= 5 && sicaklik <= 15)
           {
               System.out.println("Sinemaya gidebilirsin.");
           } if(sicaklik>= 10 && sicaklik <= 25) {
               System.out.println("Pikniğe gidebilirsin.");
           }
       } else {
           System.out.println("Yüzmeye gidebilirsin.");
       }
    }
}
