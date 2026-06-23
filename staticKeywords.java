// Static is used to share a common variable/methods of a given class [common]
public class staticKeywords {
    public static void main(String args[]){//static ensures that only one main is present in code
    Student s1=new Student();
    s1.Name="Ujjawal Baliyan";
    System.out.println(s1.Name);
    s1.schoolName="DS public school";
    Student s2=new Student();
    System.out.println(s2.schoolName);//By making Static variable any object can do changes by creating their obj. 
    
}
}
class Student{
    String Name;
    int rollno;
    static String schoolName;
    void setName(String Name){
        this.Name=Name;

    }
    String getName(){
        return this.Name;
    }
    void setrollno(int rollno){
        this.rollno=rollno;
    }
    int getrollno(){
        return this.rollno;
    }
}
