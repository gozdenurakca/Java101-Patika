
/*
Aynı isimde 4 farklı metot yazdık

 */
public class Overloading {

    static void print()
    {
        System.out.println("Parametresiz metot");
    }
    static void print2(int a)
    {
        System.out.println("Parametreler:  " + a);
    }

    static int print(int base, int exp)
    {
        int result = 1;
        for(int i = 1; i <= exp; i++)
        {
            result *= base;
        }
        return result;
    }
    static int print(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        print();
        print2(12);
        System.out.println("Üs sonucu: " + print(2,3));
        System.out.println("Toplam :" + print(5,5,5));
    }
}
