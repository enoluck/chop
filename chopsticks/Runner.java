
import java.util.Scanner;

 


public class Runner
{
   public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       System.out.print("Enter Player One name: ");
       String o = reader.nextLine();
       System.out.print("Enter Player Two name: ");
       String t = reader.nextLine();
       Player one = new Player(o);
       Player two = new Player(t);
       turns();
       
       
       
     
       
       
    }
    public static void turns(){
        Scanner reader = new Scanner(System.in);
        boolean key=true;
        while(key==false){
        System.out.println("Player one turn:");
        System.out.print("attack or split: ");
        String o = reader.nextLine();
        if(o.toLowerCase().equals("attack")){
             System.out.print("Your right or left?: ");
             String o = reader.nextLine();
        }
       
            
        }
        
        
        
        
        
        
    }
}
