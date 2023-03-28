//make HedgeHog inherit from NocturnalAnimals
public class HedgeHog extends NocturnalAnimals{
    
    //How would I indicate that the sound and eat methods have 
    //been inherited from another class and given a new implementation? 
    //What form of polymorphism is this?
    @Override
    public void sound(){
        setSound("Grunting and Snuffling");
        System.out.println("I use" + getSound() + "to communicate");
    }
     
    @Override
    public void eat(){
        setFindPrey("Utilizing my nose.");
        System.out.println("I eat bugs and fing meals by" + getFindPrey());
    }

    //Override the sleep method and have it say something that hedgehog would say
    //@Override

    }

