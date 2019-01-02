class Product1ToN{
   
    public static void main(String[] args){
         int product = 1;      // The accumulated product, init to 1
      int lowerbound = 1;
      int upperbound = 10;

      for(lowerbound = 1;lowerbound<=upperbound;lowerbound++)
      {
          product=product*lowerbound;
      }

      System.out.print(product);
    }
}