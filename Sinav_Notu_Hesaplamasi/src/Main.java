import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Adınızı Soyadınızı Giriniz=");
        String adSoyad=input.nextLine();
        while (true) {
        System.out.print("Lütfen Quiz Notunuzu Giriniz=");
        int quiz=input.nextInt();
        System.out.print("Lütfen Vize Notunuzu Giriniz=");
        int vize=input.nextInt();
        System.out.print("Lütfen Final Notunuzu Giriniz=");
        int finals=input.nextInt();

        double ortalama=((quiz*0.1)+(vize*0.3)+(finals*0.6));

            if (ortalama >= 85 && ortalama <= 100) {
                System.out.println("Sayın" + " " + adsoyad + " " + "Not Ortalamanız AA");
                System.out.println("Sınıfta Geçtiniz");
                break;
            } else if (ortalama < 85 && ortalama >= 70) {
                System.out.println("Sayın" + " " + adsoyad + " " + "Not Ortalamanız BB");
                System.out.println("Sınıfta Geçtiniz");
                break;
            } else if (ortalama < 70 && ortalama >= 60) {
                System.out.println("Sayın" + " " + adsoyad + " " + "Not Ortalamanız CC");
                System.out.println("Sınıfta Geçtiniz");
                break;
            } else if (ortalama < 60 && ortalama >= 45) {
                System.out.println("Sayın" + " " + adsoyad + " " + "Not Ortalamanız DD");
                System.out.println("Sınıfta Geçtiniz");
                break;
            } else if (ortalama<45 && ortalama >=0) {

                System.out.println("Sayın" + " " + adsoyad + " " + "Not Ortalamanız FF");
                System.out.println("Sınıfta kaldınız");
                break;
            }
            else {
                System.out.println("Lütfen geçerli bir Quiz,Vize,Final Notu giriniz");
            }
        }
    }
}
