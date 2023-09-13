import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //Değişkenleri tanımlıyoruz
        int km;
        double perKm=2.20, total, startPrice=10;

        //Kullanıcıdan verileri alıyoruz
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz(KM): ");
        km=input.nextInt();
        //Hesaplamaları yapıyoruz
        total=(km*perKm)+startPrice;
        //Minimum ödeme şartının kontrolünü yapalım
        total= (total<20) ? 20:total;
        System.out.println("Toplam tutar: "+total);
    }
}
