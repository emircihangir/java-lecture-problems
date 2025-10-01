package P01100341;

public class Hayvan{
    public String isim;
    public int yas;
    public String tur;

    Hayvan(String isim, int yas, String tur){
        this.isim = isim;
        this.yas = yas;
        this.tur = tur;
    }

    public void print(){
        System.out.println();
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Tür: " + tur);
        System.out.println();
    }

    public void sesCikar(){
        System.out.println(isim + " ses çıkarıyor raawwwrrr");
    }

    public void avlaniyor(){
        System.out.println(isim + " avlanıyorrrr.....");
    }
}