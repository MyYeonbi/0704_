package poly2.overriding.ex1;

public class AnimalMain2 {
    public static void main(String[] args) {
      Animal[] animals = new Animal[2];
      animals[0] = new Dog();
      animals[1] = new Cat();

      for (int i = 0; i<animals.length; i++) {
          animals[i].sound();
      }
    }
}
