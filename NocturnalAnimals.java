public class NocturnalAnimals implements Animals {
  
    // Create 2 encapsulated String variables

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



}

// getters and setters
