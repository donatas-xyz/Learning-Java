class Main{
     public static void main(String[] args){
           Time timeObject = new Time();
           System.out.println(timeObject.toMilitary());
           System.out.println(timeObject.toNormal());           
           timeObject.setTime(15, 34, 4);
           System.out.println(timeObject.toMilitary());
           System.out.println(timeObject.toNormal());           
     }
}