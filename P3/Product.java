package P3;

public class Product{
    public String productName;
    private float width, height, depth;

    public Product(){}

    public Product(String _productName, float _width, float _height, float _depth){
        productName = _productName;
        setWidth(_width);
        setHeight(_height);
        setDepth(_depth);
    }

    public void setWidth(float _width){
        if(_width <= 0){
            System.out.println("Invalid width number. Expected positive, received " + _width);
            return;
        }
        width = _width;
    }
    public void setHeight(float _height){
        if(_height < 0){
            System.out.println("Invalid height number. Expected positive, received " + _height);
            return;
        }
        height = _height;
    }
    public void setDepth(float _depth){
        if(_depth < 0){
            System.out.println("Invalid depth number. Expected positive, received " + _depth);
            return;
        }
        depth = _depth;
    }

    public void print(){
        System.out.println("Product Name: " + productName);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }

    public float volume(){
        return width * height * depth;
    }
}