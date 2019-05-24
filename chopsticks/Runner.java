
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
       boolean key=true;
        while(key==true){
       if(turn(one,two)==0){return;} 
       if(turn(two,one)==0){return;}
       
       
       }
       
       
    }
    public static int turn(Player a, Player b){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Player one turn:");
        System.out.print("attack or split: ");
        String o = reader.nextLine();
        if(o.toLowerCase().equals("attack")){
             System.out.print("Your right or left?: ");
             String p = reader.nextLine();
             if(p.toLowerCase().equals("right")){a.attack(b,true);}
             else{a.attack(b,false);}
        }
        else{
        a.split();
       }
       return a.win();
    }
        
       
            
        
        
        
        
    
    
}
