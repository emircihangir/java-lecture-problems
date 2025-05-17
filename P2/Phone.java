package P2;

public class Phone {
    public String brand, color;
    public int year;

    public Phone(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void call(String number){
        System.out.println("Calling " + number + "...");
    }

    public void text(String number){
        System.out.println("Texting " + number + "...");
    }

    public void print(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
