package week4;
import week4.zoo.Animal;
import week4.zoo.Dog;
import week4.zoo.Cat;

public class Main {
    public static void makeItSound(Animal animal){
        animal.makeSound();
    }
    public static void main(String[] args){
        Dog bobby= new Dog("Bobby");
        Cat dong = new Cat("Dong");
        makeItSound(bobby);
        makeItSound(dong);


        //bobby.name = "Bobby";
        //bobby.name ="Not Bobby";
        //bobby.bark();
//        bobby.makeSound();
//        Animal animal = bobby;
//        bobby.makeSound();
        //Dog buddy = new Dog("Buddy");
        //buddy.name="Buddy";
        //buddy.bark();
       // System.out.println(Dog.count);
        //System.out.println(bobby.getCount());
    }
}
