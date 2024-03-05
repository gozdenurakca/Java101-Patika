
public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1,k;

        while(i <= 5)
        {
            k = 1;
            while (k <= 10)
            {
                System.out.print(k + " , ");
                k++;
            }
            System.out.println();

            System.out.println(i);
            i++;
        }
    }
}