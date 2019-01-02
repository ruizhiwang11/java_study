public class ObjectInstance{
    public String toString() {
        return "in "+getClass().getName()+"class rewrite toString() method";
    }

    public static void main(String[] args){
        System.out.println(new ObjectInstance());
    }
}
