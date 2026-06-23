//By making a abstract methods so that everyone can use that method acc to their requirements
public class abstraction {
    public static void main(String args[]){
        chicken c=new chicken();
        Horse h=new Horse();
        System.out.print(h.color);//Automatically print parent color
        // c.walk();
        // c.eats();
        // Horse h=new Horse();
        // h.walk();
        // h.eats();  
        // Constructor called automaticall with a sequence of Aanimal->Horse-> chicken
}
    
}
abstract class Aanimal{
    String color="brown";
    Aanimal(){
        System.out.println("Animal constructor called");
    }
    void eats(){//Non_abstraction methods
        System.out.println("Animals eats");
    }
    abstract void walk();//Abstraction_methods
}
 class Horse extends Aanimal{
    //Making a constructor
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="red";
    }
     void walk(){
        System.out.println("Horse can Walk");
    }
}
 class chicken extends Aanimal{
    chicken(){
        System.out.println("it is a chicken constructor");
    }
    void walk(){
        System.out.println("Chicken  is eating");
    }

}
