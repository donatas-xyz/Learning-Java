class Main{
   public static void main(String[] args){
         System.out.println(average(134,34,456,54,5));
   }
   
   public static int average(int...numbers){
         int total = 0;
         for(int x:numbers)
             total += x;
             
             return total/numbers.length;
   }
}