public class hybrid {
    public static void main(String args[]){
        Human h=new Human();
        h.speak(); 
        h.eat();
        h.walk();
        
        

    }
    
}
class Animalss{
    void eat(){
        System.out.println("eats");
    }
}
class fish extends Animalss{
    void swim(){
        System.out.println("swimming");
    }
}
class Tuna extends fish{
    void fast(){
        System.out.println("it is very fast");
    }

}
class Shark extends fish{
    void dang(){
        System.out.println("Shark is very dangerous");
    }
}
class bird extends Animalss{
    void fly(){
        System.out.println("Birds can fly");
    }

}
class peacock extends bird{
    void wings(){
        System.out.println("Peacock has wings");
    }
}
class mammals extends Animalss{
    void walk(){
        System.out.println("Mammals is walking");
    }
}
class dog extends mammals{
    void bark(){
        System.out.println("Dogs can barks");
    }


}
class cat extends mammals{
    void talk(){
        System.out.println("Cats can do meoww");
    }
}
class Human extends mammals{
    void speak(){
        System.out.println("Humans can speak more ");
    }
} 
