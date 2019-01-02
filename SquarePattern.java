import java.util.Scanner;

class SquarePattern{


public static void main(String[] args){
    int size=0;
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the size: ");
    size=in.nextInt();
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            System.out.print("# ");
        }
        System.out.println();
    }

}
}