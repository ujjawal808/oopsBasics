public class copyConstructor {
    // there are mainly three types 1-parameterized ,2-non-parameterized,3-copy constructor 

    public static void main(String args[]){
        Studen s1=new Studen(); 
       s1.name="ujjawal";
       s1.rollno=101;
       s1.password="abcd";
       s1.marks[0]=99;
       s1.marks[1]=98;
       s1.marks[2]=100;
       Studen s2=new Studen(s1);//copy the content of s1 into object s2.
       s2.password="xyz";
       s1.marks[2]=99;//after copy the marks of s1 it still reflects changes due to the reference
       for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
       }




    }
    
}

    

class Studen{
    String name;
    int rollno;
    String password;
    int marks[];

    // shallow copy constructor [passing references]which reflect the changes.
    // Studen(Studen s1){

    //     this.name=s1.name;
    //     this.rollno=s1.rollno;
    //     marks=new int[3];
    //     this.marks=s1.marks;
    // }
    // deep constructors[changes don't reflect]

    Studen(Studen s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        // in shallow constructors we make a new array of marks and insert each marks so that after copy changes will not reflect.
        for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
        }
    }

    // constructor[Same name as name of class]
    Studen(String newName){//parameterized constructor
        this.name=newName;
        marks=new int[3];

    }
    Studen(int rollno){
        this.rollno=rollno;
        marks=new int[3];
        
    }
     Studen(){//non parameterized constructor
         System.out.println("Hello,i am ujjawal");
         marks=new int[3];
     }
}


    
