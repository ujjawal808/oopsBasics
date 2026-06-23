// Java doesn't support multiple inheritance with class but supports through interfaces
public class multipleInheritance {
    public static void main(String args[]){
        phone p=new phone();
        p.photoClick();
        p.contactNum();

    }
    
}
interface camera{
    void photoClick();
}
interface contact{
    void contactNum();
}
class phone implements camera,contact{
    public void photoClick(){
        System.out.println("Our phone has a 15px camera");
    }
    public void contactNum(){
        System.out.println("Our phone has many cantacts");
    }

}
