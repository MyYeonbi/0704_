package poly2.interfacee.ex1;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("강아지는 멍멍");
    }
    public void eat() {
        System.out.println("강아지는 사료를 냠냠");
    }
}
