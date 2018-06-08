package oceansimulationprogram;

public class OceanObject 
{
    public char idIcon = 'x';
    public int currentAge = 0;
    public int currentLifeSpan = 0;
    boolean hasMoved = false; 
    boolean isMoveable = true;
    
    public OceanObject(char objectChoice)
    {
        if(objectChoice == 'W')
        {
            currentLifeSpan = 65;
            idIcon = 'W';
        }
        else if (objectChoice == 'S')
        {
            currentLifeSpan = 65;
            idIcon = 'S';
        }
        else if (objectChoice == 'F')
        {
            currentLifeSpan =20;
            idIcon = 'F';
        
        }
        else if (objectChoice == 'P')
        {
            currentLifeSpan = 85;
            idIcon = 'P';
        
        }
        else if (objectChoice == 'K')
        {
            currentLifeSpan = 65;
            idIcon = 'K';
        
        }
        else if (objectChoice == '^')
        {
            currentLifeSpan = 200;
            idIcon = '^';
            isMoveable = false;
        }
        else if (objectChoice == 'I')
        {
            currentLifeSpan = 25;
            idIcon = 'I';
        
        }
        else if (objectChoice == 'B')
        {
            currentLifeSpan = 75;
            idIcon = 'B';
        
        }
        else if (objectChoice == 'R')
        {
            currentLifeSpan = 150;
            idIcon = 'R';
            isMoveable = false;
        }
        else if (objectChoice == 'O')
        {
            currentLifeSpan = 10;
            idIcon = 'O';
        
        }
        else
        {
            idIcon = 'X';
        }
        
        
        
    }
   
}

