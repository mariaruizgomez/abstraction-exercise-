public class Bats extends NocturnalAnimals {
    
    public void sound(){
        setSound("High screeches, chirps, and songs");
        System.out.println("I use " + getSound() + "sounds to communicate.");
    }
    public void sleep(){
       System.out.println("I hang upside down when I sleep"); 
    }
    public void eat(){
        setFindPrey("Echo Location");
        System.out.println("I eat bugs and find prey through " + getFindPrey());
    }

}

