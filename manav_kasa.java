import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {

        double armkg,elmkg,domkg,muzkg,patkg;
        double arm=2.14,elm=3.67,dom=1.11,muz=0.95,pat=5.00;
        double top;

        Scanner input= new Scanner(System.in);

        System.out.print("Armutun kg degerini giriniz : ");
        armkg= input.nextDouble();

        System.out.print("Elmanin kg degerini giriniz : ");
        elmkg= input.nextDouble();

        System.out.print("Domatesin kg degerini giriniz : ");
        domkg= input.nextDouble();

        System.out.print("Muz'un kg degerini giriniz : ");
        muzkg= input.nextDouble();

        System.out.print("Patlicanin kg degerini giriniz : ");
        patkg= input.nextDouble();

        top= armkg*arm + elmkg*elm + domkg*dom + muzkg*muz + patkg* pat ;

        System.out.println("Armut = "+armkg*arm);
        System.out.println("Elma = "+elmkg*elm);
        System.out.println("Domates = "+domkg*dom);
        System.out.println("Muz = "+muzkg*muz);
        System.out.println("Patlican = "+patkg*pat);

        System.out.print("Toplam Fiyat = "+top);


    }
}
