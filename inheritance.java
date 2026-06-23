public class inheritance {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();//inherit from parent
        shark.swims();

    }
}
   
    class Animal{
        String color;
        void eat(){
            System.out.println("Eats");
        }
        void breathe(){
            System.out.println("Breathes");
        }
    }
    class Fish extends Animal{
        int fins;
        void swims(){
        System.out.println("swims in water");
        }
    }

