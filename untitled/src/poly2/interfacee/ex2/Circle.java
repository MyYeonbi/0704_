package poly2.interfacee.ex2;

public class Circle implements Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void getArea(){
        double area = 3.14 * radius * radius;
        System.out.println("원의 넓이는 : " + area);
    }
}
