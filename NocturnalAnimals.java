// Have NocturnalAnimals use the Animals interface.
public class NocturnalAnimals implements Animals {
  
    // Create 2 encapsulated String variables called eyes and ears.

    private String findPrey;
    private String sound;
    private String eyes;
    private String ears;
    
@Override
public void sound(){
    System.out.println("I make sounds to find my way.");
}

@Override
public void eat(){
    System.out.println("I eat at night. Yum!");
}


@Override
public void sleep(){
    System.out.println("I sleep in the day. Zzzzz");
}

public String getFindPrey(){
    return findPrey;
}
public void setFindPrey(String findPrey){
    this.findPrey= findPrey;
}


public String getSound(){
    return sound;
}
}

// getters and setters
