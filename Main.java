import java.util.*;

class Main {
    public static void main (String[] args){
        List<Animals> animals = new ArrayList<>();

        // Create objects from bat, dog, and hedgeHhog classes.
        Bats bat = new Bats();
        Dog dogs = new Dog();
        HedgeHog sonic = new HedgeHog();

        //Add the animal object to the animals ArrayList.
        //This demonstrates polymorphism.
        animals.add(bat);
        animals.add(dogs);
        animals.add(sonic);
              

        for(Animals a: animals){
            a.sound();
            a.sleep();
            a.eat();
        }
    }
}