import java.uitl.*

class Main {
    public static void main (String[] args){
        List<Animals> animals = new ArrayList<>();

        // Create objects
        Bats bat = new Bats();
        Dog dog = new Dog();
        HedgeHog sonic = new HedgeHog();

        for(Animals a: animals){
            a.sound();
            a.sleep();
            a.eat();
        }
    }
}