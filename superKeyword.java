// Super is used to refer immediate parent class object [it refers to parent class]
public class superKeyword {
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println(d.color);
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("It is a Animal Constructor");
    }
}
class Dog extends Animal{
    
    Dog(){
        super();  //It is used to call the Animal.if we dont write this then java bydefault call super();
        super.color="RED";   //super refers to Animal and we can assign the value to that variable 
        System.out.println("It is a Dog Constructor");
    }
}
