// Have a diurnal use the Animals interface
public class Diurnal implements Animals {
 @Override
    public void sound(){
System.out.println("I make some arbitrary sound");
    }
 @Override
    public void eat(){
System.out.println("All Animals eat different food for nutrients.");
    }

 @Override
    public void sleep(){
System.out.println("I sleep when the moon is out");
    }
}
