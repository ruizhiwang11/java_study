import java.util.Scanner;
class CheckerPattern{
    public static void main(String[] args){
        int size=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size: ");
        size=input.nextInt();
        input.close();
        for(int row=0;row<size;row++){
            if(row%2==0){
                printpattern(size);
            }
            else{
                System.out.print(" ");
                printpattern(size);
            }
        }



    }



    public static void printpattern(int size){

        for(int i=0;i<size;i++){

            System.out.print("# ");
        }
        System.out.println();
    }
}