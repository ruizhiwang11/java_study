class Quandrangle{
    public static void draw(Quandrangle q)
    {
        System.out.println("123");
    }
}
public class Parallelogram extends Quandrangle{
    public static void main(String args[]){
        Parallelogram p= new Parallelogram();
        draw(p);
    }
}