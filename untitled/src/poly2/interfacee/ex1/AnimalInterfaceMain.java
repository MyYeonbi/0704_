package poly2.interfacee.ex1;



public class AnimalInterfaceMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
            animals[i].eat();
        }

    }
}
