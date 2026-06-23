import java.util.*;
public class AccessModifers{
    public static void main(String[] args) {
        
    
    BankAccount b=new BankAccount();
    b.name="Ujjawal";
    System.out.println(b.name);
    // b.password="abc";Not accessible
    b.setPassword("abcd");
    // System.out.println(b.password);We can change the password but can not see and print.
    }


}
class BankAccount{
    public String name;
   private String password;
//    soln is making password method public
public void setPassword(String newPswd){
    password=newPswd;
}
}