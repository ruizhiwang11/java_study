public class Compare{
    public static void main(String[] args)
    {
        String c1= new String ("ABC");
        String c2 =new String ("ABC");
        String c3=c1;
        System.out.println("c2==c3 result is: "+(c2==c3));
        System.out.println("c2.equals(c3) result is: "+(c2.equals(c3)));
    }
}