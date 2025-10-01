package P01100341;

public class Meyve {
    String isim;
    String renk;
    int hacim;

    Meyve(String isim, String renk, int hacim){
        this.isim = isim;
        this.renk = renk;
        this.hacim = hacim;
    }

    public void print(){
        System.out.println();
        System.out.println("Isim: " + this.isim);
        System.out.println("Renk: " + this.renk);
        System.out.println("hacim: " + this.hacim);
        System.out.println();
    }
}
