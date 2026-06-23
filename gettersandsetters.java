public class gettersandsetters {
    public static void main(String args[]){
        penn p1=new penn();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
    
}
class penn{
    private String color;
    private int tip;
    // used getter and setter method to access and modify the private variables
    // getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // setter 
    void setColor(String newclr){
        this.color=newclr;
    }
    void setTip(int newtip){
        this.tip=newtip;
    }

}
