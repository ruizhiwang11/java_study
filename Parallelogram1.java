class Quadrangle{
    public static void draw(Quadrangle q){
        System.out.println("this is a quadrangle");
    }
}


class Square extends Quadrangle{
   // System.out.println("square is under quadrangle");
}

class Anything{
  //  System.out.println("is nothing");
}

public class Parallelogram1 extends Quadrangle{
    public static void main(String[] args){
        Quadrangle q= new Quadrangle();
        if(q instanceof Parallelogram1){
            Parallelogram1 p = (Parallelogram1) q;
            //q(q);
        }
        if (q instanceof Square){
            Square s =(Square) q;
        }

      //  System.out.println(q instanceof Anything);
    }
}