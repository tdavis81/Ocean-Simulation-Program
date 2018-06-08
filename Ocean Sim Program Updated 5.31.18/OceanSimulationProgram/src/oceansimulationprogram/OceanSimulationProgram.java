package oceansimulationprogram;
import java.text.DecimalFormat;
import java.util.Random;

public class OceanSimulationProgram 
{
//Name :             Tyler Davis
//Program :          Ocean Simulation Projects
//Date Updated :     May 28h, 2018
//Professor :        Jeff Joiner 
//Class :            Main 

    public static OceanObject[][] board;
    public static int row = 0;
    public static int column = 0;
    public static String spaceOne = " ";
    public static String spaceTwo = "  ";
    public static String spaceThree = "   ";
    public static String spaceFour = "    ";
    public static String spaceFive = "     ";
    public static int overallCounter = 0;
    public static int outsideCounter = 0;
    public static int totalNumOfSpots = 0;
    public static int totalNumOfOutSideSpots = 0;
    public static int totalNumOfPirateships = 0;
    public static Random rand;
    
    public static void printDirections()                                        //Good // Reviewed
    {
        System.out.println("    Ocean Sim Program");
        System.out.println("    Coded By: Tyler Davis");
        System.out.println("    Date 5/2/2018");
        System.out.println("______________________________");
        
    }
    
    public static int getRow()                                                  //Good  // Reviewed
    {
        System.out.println("Please enter the number of Columns you want.");
        System.out.print("Column: ");
        row = SavitchIn.readLineInt();
        while ((row <1) || (row >1000))
        {
            System.out.println("Out of bounds");
            System.out.print("Column: ");
            row = SavitchIn.readLineInt();
        }
        
        return row;
    }
    
    public static int getColumn()                                               //Good  // Reviewed
    {
        System.out.println("Please enter the number of Rows you want.");
        System.out.print("Row: ");
        column = SavitchIn.readLineInt();
        
        while ((column <1) || (column >1000))
        {
            System.out.println("Out of bounds");
            System.out.print("Row: ");
            column = SavitchIn.readLineInt();
        }
        return column;
    }
    
    public static void initArray()                                              //Good  // Reviewed
    {
        for (int i = 0; i < column; i++)
        {
            for (int j = 0; j <row; j++)
            {
               board[i][j] = null;
            }
        }
    }
    
    public static void setRows()                                                //Good  // Reviewed
    {
        OceanBoard.setRows();
    }
    
    public static void setColumns()                                             //Good  // Reviewed
    {
        OceanBoard.setColumns();
    }
    
    public static char objectChoices()                                          //Good  // Reviewed
    {
        char whale = 'W';
        char shark = 'S';
        char fish = 'F';
        char pirateShip = 'P';
        char kraken = 'K';
        char rock = '^';
        char iceberg = 'I';
        char boat = 'B';
        char oilRig = 'R';
        char oilSlick = 'O';
        int userChoice = 0;
        
        System.out.println("");
        System.out.println("           Which object would you like to choose...");
        System.out.println("________________________________________________________________");
        System.out.println("1 - Whale, 2 - Shark , 3 - Fish , 4 - Pirate Ship, 5 - Kraken");
        System.out.println("6 - Rock, 7 - Iceberg , 8 - Boat , 9 - Oil Rig, 10 - Oil Slick");
        System.out.print("Choice : ");
        userChoice = SavitchIn.readLineInt();
        while ((userChoice <=0) || (userChoice >10))
        {
            System.out.println("I'm sorry that is not valid");
            System.out.print("Choice : ");
            userChoice = SavitchIn.readLineInt();
        }
        
     switch (userChoice) { 
        case 1:
            return whale;
        case 2:
            return shark;
        case 3:
            return fish;
        case 4:
            return pirateShip;
        case 5:
            return kraken;
        case 6:
            return rock;
        case 7:
            return iceberg;
        case 8:
            return boat;
        case 9:
            return oilRig;
        case 10:
            return oilSlick;
        default:
            return ' ';
     }
        
    }
    
    public static int errorCheckingValuesForAddMultiple(char objectChoice,int randomAmountOfObjects) //Needs Reviewed
    {
        if (objectChoice == 'K')
        {
            while (randomAmountOfObjects >totalNumOfPirateships)
            {
                System.out.println("I'm sorry you have entered a number greater than the amount of pirateships in the world");
                System.out.println("There are " + totalNumOfPirateships + " pirate ships in the world.");
                System.out.print("Amount of Random Objects : ");
                randomAmountOfObjects = SavitchIn.readLineInt();
            }

        }
        else if (objectChoice !='K' || objectChoice !='B' || objectChoice !='P')
        {
            while (randomAmountOfObjects > (totalNumOfSpots - overallCounter))
            {
                System.out.println("I'm sorry you have entered a number greater than the amount aviabable in the world");
                System.out.println("There are " + (totalNumOfOutSideSpots-outsideCounter) + " outside spots avialable and  " + overallCounter + " avialable");
                System.out.print("Amount of Random Objects : ");
                randomAmountOfObjects = SavitchIn.readLineInt();
            }
        }
        else if ((objectChoice =='P')|| (objectChoice =='B'))
        {
            while (randomAmountOfObjects >(totalNumOfOutSideSpots-outsideCounter))
            {
                System.out.println("I'm sorry you have entered a number greater than the amount aviabable on the outside");
                System.out.println("There are " + outsideCounter + " outside spots being used and " + totalNumOfOutSideSpots + " overall spots aviable on the outside");
                System.out.print("Amount of Random Objects : ");
                randomAmountOfObjects = SavitchIn.readLineInt();
            }
        }
        else 
        {
            System.out.println("Error in while");
        }
        
        return randomAmountOfObjects;
    }
    
    public static boolean checkIfOutside(int columnChoice,int rowChoice)         //Needs Reviewed
    {
        boolean isOutside = false;
        if ((board[columnChoice][rowChoice] !=null) && 
                (columnChoice == 0 && (rowChoice >= 0 && rowChoice <(row-1))) ||
                (columnChoice == (column-1) && (rowChoice >= 0 && rowChoice <=(row-1)))||
                (rowChoice == 0 && (columnChoice >= 0 && columnChoice <(column-1))) ||
                (rowChoice == (row-1) && (columnChoice >= 0 && columnChoice < (column-1))))
        {
            isOutside = true;
        }
        else 
        {
            isOutside = false;
        }
       return isOutside;
    }
    
    public static int pickEdge()                                                //Good Reviewed
    {
        int pickEdge = 0;
        pickEdge = (int)(Math.random()*4) + 1;
        return pickEdge;
    }
    
    public static void setBoatLocation(char objectChoice)                       //Good Reviewed
    {
        int columnChoice = 0;
        int rowChoice = 0;
        int pickRandEdge = 0;
        boolean found = false;
        boolean notFound =false;
        if (outsideCounter !=totalNumOfOutSideSpots)  
        {
            while (!found)
            {
                pickRandEdge = pickEdge();
                switch (pickRandEdge) { 
                    case 1:
                        columnChoice = 0;
                        rowChoice = (int)(Math.random()*row );
                        break;
                    case 2:
                        rowChoice = 0;
                        columnChoice = (int)(Math.random()*column);
                        break;
                    case 3:
                        columnChoice = column - 1;
                        rowChoice = (int)(Math.random()*row );
                        break;
                    case 4:
                        rowChoice = row -1;
                        columnChoice = (int)(Math.random()*column);
                        break;
                    default:
                        System.out.println("General Error in found boat");
                        break;
                }
                if (board[columnChoice][rowChoice] == null)
                {
                    found = true;
                }
           }
            if(found)
            {
                board[columnChoice][rowChoice] = new OceanObject(objectChoice);
                overallCounter++;
                outsideCounter++;
                if (objectChoice == 'P')
                {
                    totalNumOfPirateships++;
                }
            }
        }
        else if (outsideCounter ==totalNumOfOutSideSpots)
        {
            System.out.println("I'm sorry there are no spots available on the board to place this item.");
        }
        else
        {
            System.out.println("General Error in set boat location method.");
        }
        
        
    }
    
    public static boolean checkForValidSpot(int i, int j)                       //Needs Reviewed
    {
        boolean isValid = false;
        int pickRandomEdge = 0;
        int counter = 0;
        boolean isOutside = false;
        int newColumn = 0;
        int newRow = 0;
      
        pickRandomEdge = (int)(Math.random()*4) +1 ;
        
        while ((isValid ==false) && (counter !=4))
        {
            newColumn = i;
            newRow = j;
     
            switch(pickRandomEdge)
            {
                case 1:
                    newColumn--;
                    if (newColumn < 0)
                    {
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else if (board[newColumn][j] ==null)
                    {
                        board[newColumn][j] = new OceanObject('K');
                        isOutside = checkIfOutside(newColumn, j);
                        if(isOutside)
                        {
                            outsideCounter++;
                        }
                        else if (!isOutside)
                        {
                            //Do nothing
                        }
                        else
                        {
                            System.out.println("error in is outside in add");
                        }
                        overallCounter++;
                        isValid = true;
                        
                    }
                    else if (board[newColumn][j] !=null)
                    {
                        isValid = false;
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else
                    {
                        System.out.println("General Error in case 1 of Find kraken spot");
                    }
                    counter++;
                    break;
                case 2:
                    newRow--;
                    if (newRow < 0)
                    {
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else if (board[i][newRow] ==null)
                    {
                        board[i][newRow] = new OceanObject('K');
                        isOutside = checkIfOutside(i, newRow);
                        if(isOutside)
                        {
                            outsideCounter++;
                        }
                        else if (!isOutside)
                        {
                            //Do nothing
                        }
                        else
                        {
                            System.out.println("error in is outside in add");
                        }
                        overallCounter++;
                        isValid = true;
                        
                    }
                    else if (board[i][newRow] !=null)
                    {
                        isValid = false;
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else
                    {
                        System.out.println("General Error in case 1 of Find kraken spot");
                    }
                    counter++;
                    break;
                case 3:
                    newColumn++;
                    if (newColumn > column-1)
                    {
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1; 
                        }
                    }
                    else if (board[newColumn][j] ==null)
                    {
                        board[newColumn][j] = new OceanObject('K');
                        isOutside = checkIfOutside(newColumn, j);
                        if(isOutside)
                        {
                            outsideCounter++;
                        }
                        else if (!isOutside)
                        {
                            //Do nothing
                        }
                        else
                        {
                            System.out.println("error in is outside in add");
                        }
                        overallCounter++;
                        isValid = true;
                        
                    }
                    else if (board[newColumn][j] !=null)
                    {
                        isValid = false;
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else
                    {
                        System.out.println("General Error in case 1 of Find kraken spot");
                    }
                    counter++;
                    break;
                case 4:
                    newRow++;
                    if (newRow > row-1)
                    {
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else if (board[i][newRow] ==null)
                    {
                        board[newColumn][newRow] = new OceanObject('K');
                        isOutside = checkIfOutside(i, newRow);
                        if(isOutside)
                        {
                            outsideCounter++;
                        }
                        else if (!isOutside)
                        {
                            //Do nothing
                        }
                        else
                        {
                            System.out.println("error in is outside in add");
                        }
                        overallCounter++;
                        isValid = true;
                        
                    }
                    else if (board[i][newRow] !=null)
                    {
                        isValid = false;
                        pickRandomEdge++;
                        if(pickRandomEdge ==5)
                        {
                            pickRandomEdge=1;
                        }
                    }
                    else
                    {
                        System.out.println("General Error in case 1 of Find kraken spot");
                    }
                    counter++;
                    break;
                default:
                        break;
            }
            
        }
        if (isValid == true)
        {
            return isValid;
        }
        else if (isValid ==false)
        {
            return isValid;
        }
        else
        {
            return false;
        }
        
    }
    
    public static void setKrakenLocation(char objectChoice)                     //Needs Reviewed
    {
        int rowChoice = 0;
        int columnChoice = 0;
        int pirateCounter = 0; 
        boolean isValid = false;
          
        rowChoice =0;
        columnChoice = 0;
        
        if (totalNumOfPirateships >=1)
        {
            for(int i =columnChoice; i<column && isValid==false && pirateCounter < totalNumOfPirateships;i++)
            {
                for(int j = rowChoice; j <row && isValid==false && pirateCounter < totalNumOfPirateships; j++)
                {
                    if(board[i][j] == null)
                    {
                       //keep going
                    }
                    else if (board[i][j] !=null)
                    {
                        if (board[i][j].idIcon == 'P')
                        {
                            isValid = checkForValidSpot(i,j);
                            pirateCounter++;
                        }
                        else if (board[i][j].idIcon != 'P')
                        {
                           //keep going
                        }
                        else
                        {
                            System.out.println("General Error in kraken method");
                        }
                    }
                    else
                    {
                        System.out.println("Error in kraken");
                    }
                }
            }
            if (isValid ==false)
            {
                System.out.println("");
                System.out.println("I'm sorry we could not find a valid spot");
            }
            else if (isValid ==true)
            {
                System.out.println("");
                System.out.println("Kraken Placed.");
            }
            else
            {
                System.out.println("");
                System.out.println("Error in add kraken");
            }
        }
        else if (totalNumOfPirateships == 0)
        {
            System.out.println("");
            System.out.println("I'm sorry you cannot spawn a kraken becauese there are no Pirateships in the world.");
        }
        else
        {
            System.out.println("Error in kraken section");
        }
        
    }
    
    public static void addSingleObjectRandomly()                                // needs finished 
    {
        //Variables
        int columnChoice = 0;
        int rowChoice = 0;
        boolean isOutside = false;
        char objectChoice = ' ';
        
        System.out.println("");
        System.out.println("You have chosen to add a single object randomly.");
        if (overallCounter !=totalNumOfSpots) 
        {
            objectChoice = objectChoices();
            if ((objectChoice == 'P') ||(objectChoice == 'B'))
            {
                setBoatLocation(objectChoice);
            }
            else if (objectChoice == 'K')
            {
                setKrakenLocation(objectChoice);
            }
            else if ((objectChoice != 'P') && (objectChoice != 'B' && (objectChoice != 'K')))
            {
                rowChoice = (int)(Math.random()*row );
                columnChoice = (int)(Math.random()*column);
                while (board[columnChoice][rowChoice] !=null)
                {
                    rowChoice = (int)(Math.random()*row );
                    columnChoice = (int)(Math.random()*column);
                }
                board[columnChoice][rowChoice] = new OceanObject(objectChoice);
                isOutside = checkIfOutside(columnChoice, rowChoice);
                if(isOutside)
                {
                    outsideCounter++;
                }
                else if (!isOutside)
                {
                    //Do nothing
                }
                else
                {
                    System.out.println("error in is outside in add");
                }
                overallCounter++;
            }
            
            else
            {
                System.out.println("General Error in add single object randomly method");
            }
        }
        else if (overallCounter ==totalNumOfSpots)
        {
            System.out.println("");
            System.out.println("All the board spots have been filed, you cannot place another random object anywhere.");
        }
        else
        {
              System.out.println("General Error in Add object");
        }
        
    }
    
    public static void addSingleObjectByCoords()                                // Needs Reviewed
    {
        //Variables
        int columnChoice = 0;
        int rowChoice = 0;
        int userChoice = 0;
        char objectChoice = ' ';   
        boolean isOutside = false;
        
        System.out.println("");
        System.out.println("You have chosen to add a single object by coordinates..");
        objectChoice = objectChoices();
        System.out.print("Column Spot: ");
        rowChoice = SavitchIn.readLineInt();
        while ((rowChoice <0) || (rowChoice>row))
        {
            System.out.println("I'm sorry you have entered a value outside the bounds,try again.");
            System.out.print("Column Spot: ");
            rowChoice = SavitchIn.readLineInt();
        }
        System.out.print("Row Spot: ");
        columnChoice = SavitchIn.readLineInt();
        while ((columnChoice <0) || (columnChoice>column))
        {
            System.out.println("I'm sorry you have entered a value outside the bounds,try again.");
            System.out.print("Row Spot: ");
            columnChoice = SavitchIn.readLineInt();
        }
        rowChoice--; //Takes care of the -1 for setting the board right spots
        columnChoice--;
        if(board[columnChoice][rowChoice] != null)
        {
            System.out.println("");
            System.out.println("There is a " + board[columnChoice][rowChoice].idIcon + " at this spot, would you like to replace it?" );
            System.out.println("1 - Yes | 2 - No");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
            switch (userChoice) {
            case 1:
                System.out.println("");
                System.out.println("You have choose to replace the " + board[columnChoice][rowChoice].idIcon + " with a " + objectChoice);
                board[columnChoice][rowChoice] = new OceanObject(objectChoice);
                if (objectChoice == 'P')
                {
                    totalNumOfPirateships++;
                }
                isOutside = checkIfOutside(columnChoice, rowChoice);
                if(isOutside)
                {
                    outsideCounter++;
                }
                else if (!isOutside)
                {
                    //Do nothing
                }
                else
                {
                    System.out.println("error in is outside in add");
                }
                overallCounter++;
                break;
            case 2:
                System.out.println("You have choosen to not replace the object... If you would like to add another object, return to main menu.");
                break;
            default:
                System.out.println("General Error in add object");
                break;
            }
        }
        else if (board[columnChoice][rowChoice] == null) 
        {
            board[columnChoice][rowChoice] = new OceanObject(objectChoice);
           
            overallCounter++;
            if (objectChoice == 'P')
            {
                totalNumOfPirateships++;
            }
            isOutside = checkIfOutside(columnChoice, rowChoice);
            if(isOutside)
            {
                outsideCounter++;
            }
            else if (!isOutside)
            {
                //Do nothing
            }
            else
            {
                System.out.println("error in is outside in add");
            }
        }
        else 
        {
            System.out.println("System error in add object");
        }
        
    }
    
    public static void addMultipleObjectsRandomly()                             // Needs Reviewed
    {
        //Variables
        int columnChoice = 0;
        int rowChoice = 0;
        int randomAmountOfObjects = 0;
        char objectChoice = ' ';   
        boolean isOutside = false;
        
        System.out.println("");
        System.out.println("outside counter is " + outsideCounter);
        System.out.println("overal outside counter is " + totalNumOfOutSideSpots);
        
        if (overallCounter !=totalNumOfSpots)
        {
            objectChoice = objectChoices();
            System.out.print("Amount of Random Objects : ");
            randomAmountOfObjects = SavitchIn.readLineInt();
            randomAmountOfObjects = errorCheckingValuesForAddMultiple(objectChoice,randomAmountOfObjects);
            
            for(int i = 0; i < randomAmountOfObjects; i++)
            {
                if ((objectChoice == 'P') ||(objectChoice == 'B'))
                {
                    setBoatLocation(objectChoice);
                    if (objectChoice == 'P')
                    {
                        totalNumOfPirateships++;
                    }
                }
                else if (objectChoice == 'K')
                {
                    setKrakenLocation(objectChoice);
                }
                else if ((objectChoice != 'P') || (objectChoice != 'B') && (objectChoice != 'K') && (overallCounter !=totalNumOfSpots))
                {
                    rowChoice = (int)(Math.random()*row );
                    columnChoice = (int)(Math.random()*column);
                    while(board[columnChoice][rowChoice] !=null)
                    {
                        rowChoice = (int)(Math.random()*row  );
                        columnChoice = (int)(Math.random()*column );
                    }
                    board[columnChoice][rowChoice] = new OceanObject(objectChoice);
                    isOutside = checkIfOutside(columnChoice, rowChoice);
                    if(isOutside)
                    {
                        outsideCounter++;
                    }
                    else if (!isOutside)
                    {
                        //Do nothing
                    }
                    else
                    {
                        System.out.println("error in is outside in add");
                    }
                    overallCounter++;
                }
                else if (overallCounter ==totalNumOfSpots) 
                {
                    System.out.println("");
                    System.out.println("I'm sorry all of the spots are eithier full");
                    i = randomAmountOfObjects;
                }
                else
                {
                    System.out.println("General Error in add multiple objects randomly method");
                }
                
            }
        }
        else if (overallCounter ==totalNumOfSpots) 
        {
            System.out.println("");
            System.out.println("I'm sorry all of the spots on the board are full");
        }
        else
        {
            System.out.println("General Error in add multiple objects randomly method");
        }
        
    }
    
    public static void addMultipleObjectsByCoords()                             //Needs Reviewed
    {
        //Variables
        int columnChoice = 0;
        int rowChoice = 0;
        int amountOfObjects = 0;
        char objectChoice = ' ';   
        boolean isOutside = false;
        
        System.out.println("");
        System.out.println("You have chosen to add multiple objects by coordinates..");
        System.out.println("");
        System.out.println("How many objects would you like to place?");
        System.out.print("Amount to place:  ");
        amountOfObjects = SavitchIn.readLineInt();
        while (amountOfObjects >(totalNumOfSpots - overallCounter))
        {
            System.out.println("I'm sorry you have entered a number greater than the amount aviabable in the world");
            System.out.print("Amount of Random Objects : ");
            amountOfObjects = SavitchIn.readLineInt();
        }
        objectChoice = objectChoices();
        for (int i = 0; i < amountOfObjects; i++)
        {
            System.out.print("Column: ");
            rowChoice = SavitchIn.readLineInt();
            while((rowChoice > row) || (rowChoice >column))
            {
                System.out.println("Outside the bounds,try again");
                System.out.print("Column: ");
                rowChoice = SavitchIn.readLineInt();
            }
            System.out.print("Row: ");
            columnChoice = SavitchIn.readLineInt();
            while((rowChoice > row) || (rowChoice >column))
            {
                System.out.println("Outside the bounds,try again");
                System.out.print("Row: ");
                columnChoice = SavitchIn.readLineInt();
            }
            rowChoice--; //Takes care of the minue to set the board right
            columnChoice--;
            board[columnChoice][rowChoice] = new OceanObject(objectChoice);
            overallCounter++;
            isOutside = checkIfOutside(columnChoice, rowChoice);
            if(isOutside)
            {
                outsideCounter++;
            }
            else if (!isOutside)
            {
                //Do nothing
            }
            else
            {
                System.out.println("error in is outside in add");
            }
        }
        
    }
    
    public static void addObject()                                              //Needs Reviewed
    {
        //Variables
        int userChoice = 0;
        
        System.out.println("");
        System.out.println("      Add Object To World");
        System.out.println("______________________________");
        System.out.println("");
        System.out.println("How many objects would you like to add.. [ 1 - Single Object ] [ 2 - Multiple ]");
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        while (( userChoice <= 0 ) ||( userChoice > 2 ))
        {
            System.out.println("I'm sorry that is not a valid option, please try again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        switch (userChoice) {
            case 1:
                System.out.println("");
                System.out.println("You have chosen to add a single object, would you like to add randomly, or by coordinates?");
                System.out.println("[ 1 - Randomly ] [ 2 - Coordinates ]");
                System.out.print("Choice: ");
                userChoice = SavitchIn.readLineInt();
                while (( userChoice <= 0 ) ||( userChoice > 2 ))
                {
                    System.out.println("I'm sorry that is not a valid option, please try again.");
                    System.out.print("Choice: ");
                    userChoice = SavitchIn.readLineInt();
                }   
                switch (userChoice) {
                    case 1:
                        addSingleObjectRandomly();
                        break;
                    case 2:
                        addSingleObjectByCoords();
                       break;
                    default:
                        System.out.println("General Error in Add object method 1...");
                        break;
                }   
                break;
                
            case 2:
                System.out.println("");
                System.out.println("You have chosen to add multiple objects, would you like to add randomly, or by coordinates?");
                System.out.println("[ 1 - Randomly ] [ 2 - Coordinates ]");
                System.out.print("Choice: ");
                userChoice = SavitchIn.readLineInt();
                while (( userChoice <= 0 ) ||( userChoice > 2 ))
                {
                    System.out.println("I'm sorry that is not a valid option, please try again.");
                    System.out.print("Choice: ");
                    userChoice = SavitchIn.readLineInt();
                }   
                switch (userChoice) {
                    case 1:
                        addMultipleObjectsRandomly();
                        break;
                    case 2:
                        addMultipleObjectsByCoords();
                        break;
                    default:
                        System.out.println("General Error in Add object method 1...");
                        break;
                } 
                break;
            default:
                System.out.println("General Error in Add object method 2...");
                break;
        }
    } 
    
    public static void deleteAllOneTypeOfObject()                               // Needs Reviewed
    {  
        //Variables
        boolean isOutside = false;
        char objectChoice = ' ';
        
        System.out.println("You have chosen to delete all of one type of objects.\n");
        objectChoice = objectChoices();
        for(int i = 0; i < column;i++)
        {
            for(int j=0; j<row;j++)
            {
                if (board[i][j].idIcon == objectChoice)
                {
                    isOutside = checkIfOutside(i, j);
                    if(isOutside)
                    {
                        outsideCounter--;
                    }
                    else if (!isOutside)
                    {
                        //Do nothing
                    }
                    else
                    {
                        System.out.println("error in is outside in add");
                    }
                    board[i][j] = null;
                    overallCounter--;
                    
                }
            }
        }
        System.out.println("All objects deleted.");
    }
    
    public static void deleteSpecByCoords()                                     //Needs Reviewed
    {
        //Variables
        int rowChoice = 0;
        int columnChoice = 0;
        boolean isOutside =false;
        
        System.out.println("You have chosen to delete 1 specific object by coordinates.");
        System.out.print("Column: ");
        rowChoice = SavitchIn.readLineInt();
        while((rowChoice-1 > row) || (rowChoice-1 >row))
        {
            System.out.println("Outside the bounds,try again");
            System.out.print("Column: ");
            rowChoice = SavitchIn.readLineInt();
        }
        System.out.print("Row: ");
        columnChoice = SavitchIn.readLineInt();
        while((columnChoice-1 > column) || (columnChoice-1 >column))
        {
            System.out.println("Outside the bounds,try again");
            System.out.print("Row: ");
            rowChoice = SavitchIn.readLineInt();
        }
        
        columnChoice--; //Tales care of minue one for board...
        rowChoice--;  //Tales care of minue one for board...
        
        if (board[columnChoice][rowChoice] != null)
        {
            isOutside = checkIfOutside(columnChoice, rowChoice);
            if(isOutside)
            {
                outsideCounter--;
            }
            else if (!isOutside)
            {
                //Do nothing
            }
            else
            {
                System.out.println("error in is outside in add");
            }
            board[columnChoice][rowChoice]=null;
            overallCounter--;
            System.out.println("Object Deleted.");
        }
        else if (board[columnChoice][rowChoice] == null)
        {
            System.out.println("Nothing at this spot to delete.");
        }
        else
        {
            System.out.println("General error in delete");
        }
        
    }
    
    public static void deleteAllObjectsFromWorld()                              //Needs Reviewed
    {
        System.out.println("You have choosen to delete all objects from the world..\n");
        initArray();
        overallCounter = 0;
        outsideCounter = 0;
        totalNumOfSpots = 0;
        totalNumOfOutSideSpots = 0;
        totalNumOfPirateships = 0;
        System.out.println("All objects from the world have been deleted.");
    }
    
    public static void deleteObject()                                           //Needs Reviewed
    {
        //Variables
        int userChoice = 0;
        
        System.out.println("");
        System.out.println("             Delete Object");
        System.out.println("__________________________________");
        System.out.println("1 - Delete all of one type of object  2 - Delete 1 specific object by coordinates 3 - Delete all objects"); 
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        while (( userChoice <= 0 ) || (userChoice >3))
        {
            System.out.println("I'm sorry you have entered an invalid choice");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        switch (userChoice) {
        case 1:
            deleteAllOneTypeOfObject();
            break;
        case 2:
            deleteSpecByCoords();
            break;
        case 3:
            deleteAllObjectsFromWorld();
            break;
        default:
            System.out.println("General Error in Delete Object");
            break;
     }
    }
    
    public static void restartGame()                                            // Good  // Reviewed
    {
        overallCounter = 0;
        outsideCounter = 0;
        totalNumOfSpots = 0;
        totalNumOfOutSideSpots = 0;
        totalNumOfPirateships = 0;
        initArray();
    }
    
    public static boolean checkIfObjectDied(int i, int j)
    {
        //Variables 
        boolean isDead = false;
        double deathRatePercent = 0.0;
        double randPercent = 0.0;
        boolean isOutside = false;
      
        
        deathRatePercent = (double)board[i][j].currentAge / board[i][j].currentLifeSpan;
        randPercent = rand.nextFloat();
        isDead= randPercent < deathRatePercent;
        System.out.println("");
        System.out.println("The age of the " + board[i][j].idIcon + " at spot " + i+ ","+ j + " is " + board[i][j].currentAge);
        System.out.println("The chance it will die is " + deathRatePercent);
        
        if (isDead)
        {
            if(board[i][j].idIcon == 'P')
            {
               totalNumOfPirateships--;
            }
            isOutside = checkIfOutside(i,j);
            if(isOutside)
            {
                outsideCounter--;
            }
            else if (!isOutside)
            {   
                //nothing
            }
            else
            {
               System.out.println("Error in if statement  in isDead");
            }
            overallCounter--;
            System.out.println("The " + board[i][j].idIcon + " at spot " + i+ "," +j + " has died.");
            board[i][j] = null;
        }
        else if (!isDead)
        {

            //keep going
        }
        else
        {
            System.out.println("Error in if dead in continue");
        }
        return isDead;
     }
    
    public static boolean chanceToMove()
    {
        double chanceToMove = 0.0;
        boolean isAbleToMove = false;
        
        chanceToMove = rand.nextFloat();
        if (chanceToMove >=.55)
        {
            isAbleToMove = true;
        }
        else if (chanceToMove <.55)
        {
             isAbleToMove = false;
        }
        else
        {
            System.out.println("error in chance to move area");
        }
        
        return isAbleToMove;
    }
    
    public static boolean moveObject(int i, int j)
    {
        int directionToMove = 0;
        int newColumn = 0;
        int newRow = 0;
        boolean isValid = false;
        int counter = 0; 
       
        if (chanceToMove())
        {
            directionToMove = pickEdge();
        
            while ((isValid ==false) && (counter !=4) && (board[i][j].isMoveable=true))
            {
                newColumn = i;
                newRow = j;

                switch (directionToMove) {
                    case 1:
                        newColumn--;
                        if (newColumn < 0)
                        {
                            directionToMove++;
                            if(directionToMove ==5)
                            {
                                directionToMove=1;
                            }
                        }
                        else if (board[newColumn][j] ==null)
                        {
                            board[newColumn][j] = new OceanObject(board[i][j].idIcon);
                            board[newColumn][j].hasMoved=true;
                            board[i][j] =null;
                            isValid = true;
                            
                        }
                        else if (board[newColumn][j] !=null) 
                        {
                            System.out.println("Something here");
                            isValid = true;
                            Interactions.Interact(newColumn,j);
                            
                        }
                        else
                        {
                            System.out.println("General Error in case 1 of Find kraken spot");
                        }

                        break;
                    case 2:
                        newRow--;
                        if (newRow < 0)
                        {
                            directionToMove++;
                            if(directionToMove ==5)
                            {
                                directionToMove=1;
                            }
                        }
                        else if (board[i][newRow] ==null)
                        {
                            board[i][newRow] = new OceanObject(board[i][j].idIcon);
                            board[i][newRow].hasMoved=true;
                            board[i][j] =null;
                            isValid = true;
                        }
                        else if (board[i][newRow] !=null)
                        {
                            System.out.println("Something here");
                            isValid = true;
                           // Interactions.Interact(i,j);
                        }
                        else
                        {
                            System.out.println("General Error in case 1 of Find kraken spot");
                        }
                        counter++;
                        break;
                    case 3:
                        newColumn++;
                        if (newColumn > column-1)
                        {
                            directionToMove++;
                            if(directionToMove ==5)
                            {
                                directionToMove=1;
                            }
                        }
                        else if (board[newColumn][j] ==null)
                        {
                            board[newColumn][j] = new OceanObject(board[i][j].idIcon);
                            board[newColumn][j].hasMoved=true;
                            board[i][j] =null;
                            isValid = true;
                        }
                        else if (board[newColumn][j] !=null)
                        {
                            System.out.println("Something here");
                            isValid = true;
                           // Interactions.Interact(i,j);
                        }
                        else
                        {
                            System.out.println("General Error in case 1 of Find kraken spot");
                        }
                        counter++;
                        break;
                    case 4:
                        newRow++;
                        if (newRow > row-1)
                        {
                            directionToMove++;
                            if(directionToMove ==5)
                            {
                                directionToMove=1;
                            }
                        }
                        else if (board[i][newRow] ==null)
                        {
                            board[i][newRow] = new OceanObject(board[i][j].idIcon);
                            board[i][newRow].hasMoved=true;
                            board[i][j] =null;
                            isValid = true;
                        }
                        else if (board[i][newRow] !=null)
                        {
                            System.out.println("Something here");
                            isValid = true;
                           // Interactions.Interact(i,j);
                        }
                        else
                        {
                            System.out.println("General Error in case 1 of Find kraken spot");
                        }
                        counter++;
                        break;
                    default:
                            break;
                }
            }
            
        }
        else if (!chanceToMove() && (board[i][j].isMoveable=true) || (board[i][j].isMoveable=false) )
        {
            //do nothing
        }
        else
        {
            System.out.println("error in move method");
        }
        return isValid;
    }
    
    public static void resetFlags()
    {
        for(int i = 0; i < column; i++)
        {
            for(int j = 0; j <row; j++)
            {
                if(board[i][j] !=null)
                {
                    board[i][j].hasMoved=false;
                }
            }
        }
    }
    
    public static void continuePlaying()                                        //Needs Finished
    {
        //Variables
        int userChoice = 0;
        int amtOfTurns = 0;
        
        System.out.println("");
        System.out.println("Would you like to cylce through 1 time or multiple?");
        System.out.println("1 - Single cycle,  2 - Multiple Cycles");
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        while ((userChoice <=0) || (userChoice >2))
        {
            System.out.println("I'm sorry you have entered an invalid choice, please try again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        if (userChoice ==1)
        {
            System.out.println("You have selected to cylce through one time\n");
            
            resetFlags();
            for(int i = 0; i < column; i++)
            {
                for(int j = 0; j < row ; j++)
                {
                    if(board[i][j] != null)
                    {
                        board[i][j].currentAge++;
                        if (checkIfObjectDied(i,j))
                        {
                            //object died move to next spot
                        }
                        else if(!checkIfObjectDied(i,j))
                        {
                            if (board[i][j].hasMoved==false)
                            {
                                if (moveObject(i,j))
                                {
                                    //do nothing
                                }
                                else if(!moveObject(i,j)) //Each cycle increment and decremte outside spots free 
                                {
                                    board[i][j].hasMoved=false;
                                }
                                else
                                {
                                    
                                }
                            }
                            else if (board[i][j].hasMoved!=false)
                            {
                                
                            }
                            else
                            {
                                
                            }
                            
                        }
                        else
                        {
                            System.out.println("error in if statement for loop continue");
                        }
                        
                    }
                    else if(board[i][j] ==null)
                    {
                        //keep going
                    }
                    else 
                    {
                        System.out.println("Error in for statement continue");
                    }
                    
                }
            }
        }
        else if (userChoice ==2)
        {
            System.out.println("You have selected to cylce through multiple times");
            System.out.print("Amount of cycles ");
            amtOfTurns = SavitchIn.readLineInt();
            while (amtOfTurns <=0)
            {
                System.out.println("You cannot enter a cylce equal to or under zero");
                System.out.print("Amount of cycles");
                amtOfTurns = SavitchIn.readLineInt();
            }
            for (int x = 0; x < amtOfTurns; x++)
            {
                resetFlags();
                for(int i = 0; i < column; i++)
                {
                    for(int j = 0; j < row ; j++)
                    {
                        if(board[i][j] != null)
                        {
                            checkIfObjectDied(i,j);
                            moveObject(i,j);
                            
                        }
                        else if(board[i][j] ==null)
                        {
                            //keep going
                        }
                        else 
                        {
                            System.out.println("Error in for statement continue");
                        }
                        
                    }
                }
            }
            
        }
        else
        {
            System.out.println("General Error in Continue Method");
        }
        
    }
    
     public static int switchBoardMain()                                        //Good // Reviewed
    {
        //Variables
        int userChoice = 0; 
        
        System.out.println("");
        System.out.println("          User Menu       ");
        System.out.println("____________________________");
        System.out.println("     [ 1 - Continue    ]");
        System.out.println("     [ 2 - Add         ]");
        System.out.println("     [ 3 - Delete      ]");
        System.out.println("     [ 4 - Restart     ]");
        System.out.println("     [ 5 - Exit        ]");
        
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        while ((userChoice <=0) ||(userChoice >6))
        {
            System.out.println("I'm sorry that is not a valid option, please try again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        return userChoice;
    }
    
    public static void switchBoardChoice(int userChoice)                        //Good  // Reviewed
    {
        
        switch (userChoice) {
            case 1:
                continuePlaying();
                break;
            case 2:
                 addObject();
                break;
            case 3:
                 deleteObject();
                break;
            case 4:
                 restartGame();
                break;
            case 5:
                System.out.println("");
                System.out.println("You have chosen to exit");
                break;
            default:
                System.out.println("General Error in SwitchBoard Choice Method.");
                break;
        }
        
    }
    
    public static void oceanMain()                                              //Good  // Reviewed
    {
        //Variables
        int userChoice = 0;
        
        printDirections();
        row = getRow();
        column = getColumn();
        board = new OceanObject[column][row];
        initArray();
        totalNumOfSpots = (column * row);
        totalNumOfOutSideSpots = (column * 2);
        totalNumOfOutSideSpots = totalNumOfOutSideSpots + (row*2);
        totalNumOfOutSideSpots = (totalNumOfOutSideSpots -4);
        rand = new Random();
        
        while ( userChoice !=5 )
        {
            setRows();
            setColumns();
            userChoice = switchBoardMain();
            switchBoardChoice(userChoice);
            
        }
    }
    
    public static void main(String[] args)                                      //Good // Reviewed
    {
      
        oceanMain();
    }
    
}
