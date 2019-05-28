
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
        printstat(one,two);
            turn(one,two); 
       if(two.win()==1){System.out.println(one.getname() + "wins!");return;}
       printstat(one,two);
       turn(two,one);
       if(one.win()==1){System.out.println(two.getname() + "wins!");return;}
       
       
       }
       
       
    }
    public static int turn(Player a, Player b){
        Scanner reader = new Scanner(System.in);
        String bob = a.getname();
        System.out.println(bob+ "next turn");
        System.out.print("attack or split: ");
        String o = reader.nextLine();
        if(o.toLowerCase().equals("attack")){
             System.out.print("Your right or left?: ");
             String p = reader.nextLine();
             if(p.toLowerCase().equals("right")){a.attack(b,true);}
             else{a.attack(b,false);}
        }
        else{
            System.out.print("Split to how much? (either hand): ");
             int z = reader.nextInt();
        a.split(z);
       }
       return a.win();
    }
   public static void printstat(Player a, Player b){
     System.out.println("Player one                         Player two");  
     System.out.println("Right hand:                        Right hand:");  
     System.out.println(a.getright()+"                        " + b.getright());  
     System.out.println("Left hand:                         Left hand:");  
     System.out.println(a.getleft()+ "                         " + b.getleft());  
    }
       
            
        
        
        
        
    
    
}
