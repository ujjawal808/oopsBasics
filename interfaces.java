// Interfaces is used to acthiceve->1.interface implements the multiple inheritance,2. it is used to achieve 100% abstraction
public class interfaces {
    public static void main(String args[]){
        King k=new King();
        k.moves();

    }
    
}
interface chessPlayer{
    void moves(); 
    //this is the abstract method so we cant used here 
}
class Queen implements chessPlayer{
    public void moves(){// // Must be public, otherwise compile error
        System.out.println("left,right,top,bottom,diagonal");

    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down");

    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal-(by 1 step)");

    }
}
//So this code shows 100percent abstraction because it show only essential features 

