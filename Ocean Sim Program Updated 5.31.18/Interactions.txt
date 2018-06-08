package oceansimulationprogram;
import java.util.Random;

public class Interactions 
{
    public static Random rand;
    
    public static void Interact(int i,int j)
    {
        rand = new Random();
        switch (OceanSimulationProgram.board[i][j].idIcon) {
            case 'W':
                whaleInteractions(i,j);
                break;
            case 'S':
                sharkInteractions(i,j);
                break;
            case 'F':
                fishInteractions(i,j);
                break;
            case 'P':
                pirateInteractions(i,j);
                break;
            case 'K':
                krakenInteractions(i,j);
                break;
            case '^':
                //no interactions
                break;
            case 'I':
                iceBergInteractions(i,j);
                break;
            case 'B':
                boatInteractions(i,j);
                break;
            case 'R':
                rigInteractions(i,j);
                break;
            case 'O':
                oilInteractions(i,j);
                break;
            default:
                System.out.println("Error in interactions method");
                break;
        }
        
    }
    
    public static void whaleInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
            double interactionOption = 0.0;
        
           interactionOption = rand.nextFloat();
           if(interactionOption > .45)
           {
              chanceToMate(); 
           }
           else if ((interactionOption <=.45 ) && (interactionOption >=.22))
           {
               chanceToKill();
           }
           else if (interactionOption <.22 )
           {
               chanceToGetKilled();
           }
           else
           {
               
           }
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            chanceToKill();
            chanceToGetKilled();
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            chanceToKill();
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            chanceToGetKilled();
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            chanceToKill();
            chanceToGetKilled();
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
           //no interactions
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            //no interactions
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
           
           chanceToGetKilled();
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            //no interactions
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'W') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            chanceToGetKilled();
        }
        else
        {
            
        }
        
    }
    
    public static void sharkInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'S') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void fishInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'F') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void pirateInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'P') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void krakenInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'K') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void iceBergInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'I') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void boatInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'B') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void rigInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'R') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void oilInteractions(int i , int j )
    {
        
        if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'W'))
        {
           
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'S'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'F'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'P'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'K'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == '^'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'I'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'B'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'R'))
        {
            
        }
        else if ((OceanSimulationProgram.board[i][j].idIcon == 'O') && (OceanSimulationProgram.board[i-1][j].idIcon == 'O'))
        {
            
        }
        else
        {
            
        }
        
    }
    
    public static void chanceToMate()
    {
        double chanceToMate = 0.0;
        
        chanceToMate = rand.nextFloat();
        if(chanceToMate > .65)
        {
          System.out.println("The object did not mate");
        }
        else if (chanceToMate <=.65)
        {
           System.out.println("The object matted");
           //try to create an object around the object that got moved on to. Place the baby in one of the spots around the object that got moved onto
           //IF there are no spots free, object cannot mate
           
        }
        else
        {
            System.out.println("Error in chance to mate");
        }
        
        
    }
    
    public static void chanceToKill()
    {
        double chanceToKill = 0.0;
        
        chanceToKill = rand.nextFloat();
        if(chanceToKill > .65)
        {
            // the object killed
        }
        else if (chanceToKill <=.65)
        {
            //the object did not kill
        }
        else
        {
            System.out.println("Error in chance to mate");
        }
    }
    
    public static void chanceToGetKilled()
    {
        double chanceToDie = 0.0;
        
        chanceToDie = rand.nextFloat();
        if(chanceToDie > .65)
        {
            // the object gets killed
        }
        else if (chanceToDie <=.65)
        {
            //the object gets killed
        }
        else
        {
            System.out.println("Error in chance to mate");
        }
    }
    
    
    
    
    
}
