class Main{
    public static void main(String[] args){
        int firstarray[][] = {{324,656,78,9},{324,46,686,9}};
        int secondarray[][] = {{23,657,87,54},{5},{35,65,8}};
        
        System.out.println("This is the first array");
        display(firstarray);
        
        System.out.println("This is the second array");
        display(secondarray);
    }
    
    public static void display(int x[][]){
        for(int row = 0; row < x.length; row++){
           for(int column = 0; column < x[row].length; column++){
              System.out.print(x[row][column] + "\t");
           }
           System.out.println();
        }
    }
}