//Parent and child have same method with different working/definition. 
public class methOverriding {
    public static void main(String args[]){
        deer d=new deer();
        d.eat();

    }
    
}
class Anima{
    void eat(){
        System.out.println("Eats everything ");

    }

}
class deer extends Anima{
    void eat(){
        System.out.println("Eats Grass");
    }
}
