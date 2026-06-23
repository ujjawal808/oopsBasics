// there are mainly three types 1-parameterized ,2-non-parameterized,3-copy constructor 
public class typeofConstructors {
    public static void main(String args[]){
        Studen s1=new Studen("Ujjawal"); 
       System.out.println(s1.name);
       Studen s2=new Studen();


    }
    
}

    

class Studen{
    String name;
    int rollno;
    // constructor[Same name as name of class]
    Studen(String newName){//parameterized constructor
        this.name=newName;

    }
     Studen(){//non parameterized constructor
         System.out.println("Hello,i am ujjawal");
     }
}

