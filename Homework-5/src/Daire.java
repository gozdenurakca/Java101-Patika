import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Daire {
    public static void main(String[] args) {
        double yaricap, alan, cevre, 𝜋 = 3.14, 𝛼, dilimAlan;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hesaplamak istediğiniz dairenin yarıçapını giriniz: ");
        yaricap = input.nextDouble();
        alan = 𝜋 * yaricap * yaricap;
        System.out.println("Dairenin alanı : " + alan);
        cevre = 2 * 𝜋 * yaricap;
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.print("Dairenin merkez açi ölçüsünü giriniz : ");
        𝛼 = input.nextDouble();
        dilimAlan = (𝜋 * (yaricap*yaricap) * 𝛼) / 360;
        System.out.print("Dairenin " + 𝛼 + " merkez açılı daire diliminin alanı : " +dilimAlan);
    }

}
