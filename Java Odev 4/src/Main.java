import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double kmbasina=2.20, baslangicUcreti=10, total=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("KM Giriniz : ");
        km = inp.nextInt();

        total+=baslangicUcreti;
        total+=km*kmbasina;
        total = (total<20) ? 20 : total;
        System.out.print("Ucret : "+ total);

    }
}