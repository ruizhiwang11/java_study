public class Charac{
    public static void main(String args[]){
        String str=Integer.toString(456);
        String str2=Integer.toBinaryString(456);
        String str3=Integer.toHexString(456);
        String str4=Integer.toOctalString(456);

        System.out.print(str+" "+str2+"\t"+str3+"\t"+str4);
    }
}