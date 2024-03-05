import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int pass;
        boolean askPassword = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Şifre giriniz : ");
            pass = input.nextInt();
            if(pass == 123)
            {
                System.out.print("Şifre doğru");
                askPassword = false;
            } else {
                System.out.println("Şifre yanlış.");
            }
        } while(askPassword);
    }
}
