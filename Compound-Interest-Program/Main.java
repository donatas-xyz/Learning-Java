
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
      public static void main(String[] args) {
             double amount;
             System.out.print("Enter a principal:");
             double principal = BIO.getDouble();
             System.out.print("Enter a rate:");
             double rate = BIO.getDouble();
             
             for(int day = 1; day <= 365; day+=30){
                 amount = principal * Math.pow(1 + rate, day);
                 System.out.println(day + "   " + amount);
             }
      }
}
