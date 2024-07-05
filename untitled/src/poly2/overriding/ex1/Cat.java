package poly2.overriding.ex1;

public class Cat extends Animal {

    public Cat() {}
    public Cat(String name) {
        System.out.println(name);
    }

    @Override
    public void sound(){
        System.out.println("고양이는 야옹~");
    }
}
