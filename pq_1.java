import java.util.*;
public class pq_1 {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        complex c=new complex();
        c.sum();
        c.diff();
        c.prod();



    }
    
}
class complex{

    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
    
    void sum(){
        int summ=a+b;
        System.out.println(summ);

    }
    void diff(){
        int sub=a-b;
        System.out.println(sub);
    }
    void prod(){
        int mul=a*b;
        System.out.println(mul);
    }


}
