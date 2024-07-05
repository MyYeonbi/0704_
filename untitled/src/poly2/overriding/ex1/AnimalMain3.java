package poly2.overriding.ex1;

public class AnimalMain3 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Animal[] animals = {new Dog(), new Cat()};
      for (int i = 0; i<animals.length; i++) {
          animals[i].sound();
      }
    }
}
