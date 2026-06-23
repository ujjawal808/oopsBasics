public class multilevelInheritance {
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        d.legs=4;
        System.out.println(d.legs);

    }
    
}
class  Animals{
    String color;
    void eat(){
        System.out.println("Eats");
    }

}
class Mammals extends Animals{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
