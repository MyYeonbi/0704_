package poly2.overriding;

public class Child extends Parent {
    @Override
    public void method(){
        System.out.println("여기는 차일드");
    }
    public void method1(){
        System.out.println("wot");
    }
}
