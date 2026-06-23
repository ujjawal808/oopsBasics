public class constructors {
    public static void main(String args[]){
        Student s1=new Student("Ujjawal");//pass name
        System.out.println(s1.name);
        // Student s1=new Student();


    }
    
}
class Student{
    String name;
    int rollno;
    // constructor[Same name as name of class]
    Student(String newName){
        this.name=newName;

    }
    // Student(){
    //     System.out.println("Hello,i am ujjawal");
    // }
}
