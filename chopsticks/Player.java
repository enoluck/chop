
import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private int totalfing;
   private int rightfing;
  private int leftfing;
  private int win=0;
  private String name;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        // initialise instance variables
        this.name = name;
        totalfing = 2;
        rightfing = 1;
        leftfing = 1;
    }
    public String getname(){return name;}
    public int getright(){return rightfing;}
        public int getleft(){return leftfing;}
    public void attack(Player other, boolean fromright)
    {
        boolean toright;
                Scanner reader = new Scanner(System.in);
        
        System.out.println("Attack left or right:");
        String p = reader.nextLine();
        int b;
        if(fromright){b = rightfing;}
        else{   b = leftfing;}
              if(p.toLowerCase().equals("right")){other.getAttacked(true,b);}
             else{other.getAttacked(false,b);}
        
        
        
    }
    public void split(int num)
    {
        if(num>totalfing || num<0){rightfing=totalfing; leftfing=0;}
        else{rightfing=num;
        leftfing=totalfing-num;
    }
    
    }
    public void getAttacked(boolean toright, int num)
    {
        if(toright){
            rightfing+=num;
            if(rightfing>4){rightfing=0;}
        }
        else{leftfing+=num;
              if(leftfing>4){leftfing=0;}
        }
        if(rightfing + leftfing ==0){win = 1;}
        totalfing=rightfing+leftfing;
    }
    public int win()
    {
        return win;
    }
   
    
   
}
