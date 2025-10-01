public class Kargo {
    private String takipKodu;
    private int agirlik, gonderiTipi;

    public void kargoBilgileriniGoster(){
        System.out.println("Takip kodu: " + takipKodu);
        System.out.println("Ağırlık: " + agirlik);
        if(gonderiTipi == 1) System.out.println("Gönderi tipi: Standard");
        else System.out.println("Gönderi tipi: Hızlı");
    }

    public double kargoUcretHesapla(){
        double ucret;
        if(gonderiTipi == 1) ucret = agirlik*0.5;
        else ucret = agirlik*0.8;

        if(ucret < 20) ucret = 20;

        return ucret;
    }

    public void setAgirlik(int agirlik) {
        if(agirlik <= 0){
            System.out.println("Geçersiz ağırlık değeri.");
            return;
        }
        this.agirlik = agirlik;
    }
    public void setGonderiTipi(int gonderiTipi) {
        if(gonderiTipi != 1 && gonderiTipi!= 2){
            System.out.println("Geçersiz gönderi tipi değeri.");
            return;
        }
        this.gonderiTipi = gonderiTipi;
    }
    public void setTakipKodu(String takipKodu) {
        this.takipKodu = takipKodu;
    }
    public int getAgirlik() {
        return agirlik;
    }
    public int getGonderiTipi() {
        return gonderiTipi;
    }
    public String getTakipKodu() {
        return takipKodu;
    }
}
