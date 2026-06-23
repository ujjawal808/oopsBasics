// function with same name same class but different parameters.
 public class methodOverloading {
    public static void main(String args[]){
        calc c=new calc();
        System.out.println(c.sum(2,4));
        System.out.println(c.sum(2,4,6));
        System.out.println(c.sum((float)2.5,(float)3.5));

    }
    
}
class calc{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
