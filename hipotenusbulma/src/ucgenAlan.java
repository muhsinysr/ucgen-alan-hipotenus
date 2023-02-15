import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {

       Scanner girdi = new Scanner(System.in);
       System.out.println("3 Adet Kenar Uzunluğu Girin");

       int aKenarı, bKenarı, cKenarı;

       aKenarı = girdi.nextInt();
       bKenarı = girdi.nextInt();
       cKenarı = girdi.nextInt();

       int u = (aKenarı+bKenarı+cKenarı)/2;
       double alan = Math.pow(u*(u-aKenarı)*(u-bKenarı)*(u-cKenarı),0.5);
       System.out.println(alan);

    }
}
