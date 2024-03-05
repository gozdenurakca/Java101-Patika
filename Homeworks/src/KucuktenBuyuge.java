import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("Lütfen sayı 1'i giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("Lütfen sayı 2'i giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("Lütfen sayı 3'ü giriniz : ");
        sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En büyük sayı " + sayi1 + " dir.");
            if (sayi2 > sayi3) {
                System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
            } else if (sayi3 > sayi2)
                System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
            else if (sayi3 == sayi2) {
                System.out.println(sayi1 + " > " + sayi2 + " = " + sayi3);
            }

        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük sayı " + sayi2 + " dir.");
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else if (sayi3 > sayi1) {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            } else if (sayi1 == sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " = " + sayi3);
            }
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.print("En büyük sayı " + sayi3 + " tür.");
            if (sayi2 > sayi1) {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            } else if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else if (sayi1 == sayi2) {
                System.out.println(sayi3 + " > " + sayi2 + " = " + sayi1);
            }
        } else if (sayi1 > sayi3 && sayi1 == sayi2) {
            System.out.println("Sonuç : " + sayi1 + " = " + sayi2 + " > " + sayi3);
        } else if (sayi1 > sayi2 && sayi1 == sayi3) {
            System.out.println("Sonuç : " + sayi1 + " = " + sayi3 + " > " + sayi2);
        } else if (sayi2 > sayi3 && sayi1 == sayi2) {
            System.out.println("Sonuç : " + sayi1 + " = " + sayi2 + " > " + sayi3);
        } else if (sayi2 > sayi1 && sayi3 == sayi2) {
            System.out.println("Sonuç : " + sayi3 + " = " + sayi2 + " > " + sayi1);
        } else
            System.out.println("Hepsi eşittir." + sayi3 + " = " + sayi1 + " = " + sayi2);
    }
}