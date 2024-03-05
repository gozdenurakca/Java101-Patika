import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password, password2, newPassword;
        String userName;

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextInt();
        System.out.print("Şifrenizi doğrulamak için bir kere daha giriniz :");
        password2 = input.nextInt();

        if (password == password2) {
            System.out.print("Sisteme başarılı bir şekilde giriş yapıldı..");
        } else {
            System.out.println("Yeni bir şifre oluşturmak için 1' e çıkış yapmak için 2'e basınız");
            int choose;
            choose = input.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.print("Yeni oluşturmak istediğiniz şifreyi giriniz :");
                    newPassword = input.nextInt();
                    if(password == newPassword)
                    {
                        System.out.print("Şifre oluşturulamadı, lütfen başka bir şifre deneyiniz..");
                    } else {
                        System.out.print("Yeni şifreniz başarılı bir şekilde oluşturuldu..");
                    }
                    break;
                case 2:
                    System.out.print("Sistemden çıkış yapılıyor.");
                    break;
                default:
                    System.out.print("Geçersiz bir işlem numarası girdiniz, tekrar deneyiniz..");
            }
        }
    }
}