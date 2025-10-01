import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Kargo[] kargolar = new Kargo[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Kargo currentKargo = new Kargo();

           System.out.print((i+1) + ". kargo'nun takip kodu: ");
           String tkIn = scanner.nextLine();
           currentKargo.setTakipKodu(tkIn);

           System.out.print((i+1) + ". kargo'nun ağılığı: ");
           int agIn = Integer.parseInt(scanner.nextLine());
           currentKargo.setAgirlik(agIn);
           
           System.out.print((i+1) + ". kargo'nun gönderi tipi: ");
           int gtIn = Integer.parseInt(scanner.nextLine());
           currentKargo.setGonderiTipi(gtIn);

           kargolar[i] = currentKargo;
        }

        double toplamUcret = 0;
        for (int i = 0; i < kargolar.length; i++) {
            kargolar[i].kargoBilgileriniGoster();
            toplamUcret += kargolar[i].kargoUcretHesapla();
        }

        System.out.println("Toplam ücret: " + toplamUcret);

        scanner.close();
    }
}
