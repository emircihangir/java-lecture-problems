package P3;

public class P3 {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 3, 5, 2.5f);
        product1.print();
        System.out.println("Product 1 volume: " + product1.volume());

        Product product2 = new Product("Product 2", 2.74f, 13, 9.422f);
        product2.print();
        System.out.println("Product 2 volume: " + product2.volume());
        
    }
}
