class Main{
   public static void main(String[] args){
      int bucky[] = {21,434,5,32,67};
      int sum = 0;
      
      for(int counter = 0; counter < bucky.length; counter++){
         sum += bucky[counter];
      }
      
      System.out.println("The sum of these numbers is " + sum);
   }
}
