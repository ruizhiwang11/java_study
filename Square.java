import java.util.Scanner;

public class Square{


         private int width=0;
        private  int length=0;
        private  int square=0;
  
    
      

        public  int calculate(int x,int y)
        {
            width =x;
            length =y;
            square=width*length;
            return square;
        }

        public  void print_result(){
            System.out.println("Result is: "+square);
        }
    

    public Square(){

    }

        public static void main(String[] args){

            Square s1=new Square();
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the width: ");
            int x=scan.nextInt();
            System.out.println("Enter the length: ");
            int y=scan.nextInt();
            s1.calculate(x,y);
            s1.print_result();

        }
    
}