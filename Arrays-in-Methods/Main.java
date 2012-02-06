class Main{
    public static void main(String[] args){
          int bucky[] = {23,43,64,86,9};
          change(bucky);
          
          for(int y:bucky)
             System.out.println(y);
    }
    
    public static void change(int x[]){
          for(int counter = 0; counter < x.length; counter++)
          x[counter] += 5;
    }
}