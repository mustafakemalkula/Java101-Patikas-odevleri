import java.util.Scanner;

public class proje {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double a,b, c, kdv;


        System.out.println("KDV Hesaplayıcısına Hoşgeldiniz!");
        System.out.println("Ürünün Fiyatı Nedir? ");
        a = input.nextDouble();
        kdv = a>=1000 ? 0.8 : 0.18;
        System.out.println("Girdiğiniz ürünün KDV oranı: " + kdv);
        b = a*kdv;
            System.out.println("Girdiğiniz ürünün KDV tutarı: " + b);

        c = b +a;

        System.out.println("Ürünün KDV'li fiyatı: " + c);
        System.out.println("Bizi tercih ettiğiniz için teşekkürler!");













    }
}
