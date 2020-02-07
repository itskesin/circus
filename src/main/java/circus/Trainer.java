package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting, from subclass to superclass(implicit)
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak()); //behaves according to actual type, not reference type
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot());
        //Circus.Animal.Animal a2 = new Circus.Animal.Animal(); // should not create animal object
        //Circus.Animal.Bird b2 = new Circus.Animal.Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) { // check type before casting, ClassCastException
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
