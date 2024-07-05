package poly2.interfacee.ex2;

public class Rectangle implements Shape {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void getArea() {
        System.out.println("사각형의 넓이는 : "+ width * height);

    }
}
