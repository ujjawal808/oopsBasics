public class obj_and_classes {
    public static void main(String[] args) {
        // Object of pen
        pen p1=new pen();
        // call method
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Red";
        System.out.println(p1.color);
    }
    
}
class pen{
    // Attributes
    String color;
    int tip;
    // functions
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}