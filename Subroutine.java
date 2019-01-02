class Parent{
    Parent(){
        System.out.println("use parent class Parent() method: ");
    }
}

class SubParent extends Parent{
    SubParent(){
        System.out.println("use son's SubParent() mathod: ");
    }
}
public class Subroutine extends SubParent{
    Subroutine(){
        System.out.println("use son's subroutine() method: ");

    }

    public static void main(String[] args){
        Subroutine s=new Subroutine();
    }
}