//Make dog inherit from Diurnal
public class Dog extends Diurnal {
   
    public static int legs = 4;
    private String name;
    //Create a String variable called owner that implements encapsulation 
    private String owner;

    public Dog(){

    }

    public Dog(String name, String owner){
        this.name=name;
        this.owner=owner;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
