import java.util.Scanner;

/*
Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        int password, password2;

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz : ");
        password = input.nextInt();
        System.out.print("Lütfen doğrulamak için şifrenizi bir kez daha giriniz : ");
        password2 = input.nextInt();

        if(password == password2)
        {
            System.out.println("Sisteme başarılı bir şekilde girildi.");
        }
        else {
            System.out.println("Şifreniz yanlış, yeni bir şifre oluşturmak istiyorsanız 1'e," +
                    "çıkış yapmak istiyorsanız 2'e basınız.");
            int decide = input.nextInt();
            switch (decide) {
                case 1:
                    System.out.println("Yeni şifre oluşturunuz");
                    int newPassword = input.nextInt();
                    if(password == newPassword)
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız.");
            }
        }
    }
}