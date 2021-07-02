import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km;
        Scanner imput = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = imput.nextDouble();
        double tutar = 10.0 + km*2.20;
        System.out.println("Toplam ücret = " + (tutar < 20 ? "20" : tutar ) + "TL");
    }
}
