import java.util.Scanner;

public class ${NAME} {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double a,b, c, kdv;


        System.out.println("KDV Hesaplayıcısına Hoşgeldiniz!");
        System.out.println("Ürünün Fiyatı Nedir? ");
        a = input.nextDouble();
        kdv = a>=1000&&a>=0 ? 18 : 8;
        b = (a*kdv)/100;
        System.out.println("Girdiğiniz ürünün KDV tutarı: " + b);
        c = a+b;
        System.out.println("Ürünün KDV'li fiyatı: " + c);
        System.out.println("Bizi tercih ettiğiniz için teşekkürler!");













    }
}
