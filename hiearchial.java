public class hiearchial {
    public static void main(String args[]){
        Mammals m=new Mammals();
        m.eat();
        m.walk();
       

    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats");
    }
}
class Fish extends Animal{
    void swim(){
    System.out.println("Fish can swim");
}
}
class Bird extends Animal{
    void fly(){
        System.out.println("Bireds can fly");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Mamals can walk");
    }
}
