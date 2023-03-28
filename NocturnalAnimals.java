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
    System.out.println("I sleep during the day. Zzzzz");
}

// getters and setters

public String getFindPrey(){
    return findPrey;
}
public void setFindPrey(String findPrey){
    this.findPrey= findPrey;
}
public String getSound(){
    return sound;
}
public void setSound(String sound){
    this.sound= sound;
}
public String getEyes(){
    return eyes;
}
public void setEyes(String eyes){
    this.eyes= eyes;
}
public String getEars(){
    return ears;
}
public void setEars(String ears){
    this.ears= ears;
}
}


