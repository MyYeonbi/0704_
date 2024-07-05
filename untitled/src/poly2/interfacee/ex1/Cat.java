package poly2.interfacee.ex1;

public class Cat implements Animal {
    @Override
    public void sound(){
        System.out.println("고양이는 야용~");
    }
    public void eat(){
        System.out.println("고양이는 츄르를 할짝~");
    }
}
