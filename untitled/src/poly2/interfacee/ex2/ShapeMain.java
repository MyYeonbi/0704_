package poly2.interfacee.ex2;

public class ShapeMain {
    public static void main(String[] args) {
       Shape[] shapes = {new Rectangle(10,10),new Triangle(10,10),new Circle(10)};
       for(int i = 0 ; i < shapes.length ; i++){
           shapes[i].getArea();
       }
    }
}
