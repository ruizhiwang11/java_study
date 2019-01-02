public class Practice8_2a{
    public static void main(String args[]){
        Character char1= new Character('a');
        Character char2= new Character('A');
        if(char1.equals(char2.charvalue())==true)
        {
            System.out.println("Yes equal");

        }
        else
        {
            System.out.println("No");
            char2.toLowerCase(char2.charvalue());

            System.out.println(char2);
            if(char1.equals(char2.charvalue())==true)
        {
            System.out.println("Yes equal");

        }


        }
    }
}