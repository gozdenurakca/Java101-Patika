import java.util.Scanner;

/*
Pratik - Dik Üçgende Hipotenüs Bulan Program

        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class UcgenHipotenus {

    public static void main(String[] args) {

        int kenar1, kenar2, alan;
        double cevre, hipo;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenar uzunluğunu giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("2.Kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();
        hipo = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs: " +hipo);

        cevre = kenar1 + kenar2 + hipo;
        System.out.println("üçgenin çevresi: " + cevre);
        alan = ( kenar1 * kenar2 ) / 2;
        System.out.println("üçgenin alanı: " + alan);



    }
}
