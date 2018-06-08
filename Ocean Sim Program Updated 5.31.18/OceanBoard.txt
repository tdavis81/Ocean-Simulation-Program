package oceansimulationprogram;

import static oceansimulationprogram.OceanSimulationProgram.board;
import static oceansimulationprogram.OceanSimulationProgram.column;
import static oceansimulationprogram.OceanSimulationProgram.row;

public class OceanBoard 
{
    public static String spaceOne = " ";
    public static String spaceTwo = "  ";
    public static String spaceThree = "   ";
    public static String spaceFour = "    ";
    public static String spaceFive = "     ";
    
    public static void setRows()                                                //Good  // Reviewed
    {
        for(int i = 0; i < row; i++)
        {
            if ((row < 10) && (column < 10))
            {
                if (i < 1)
                {
                    System.out.print(spaceTwo);
                }
                System.out.print((i+1) + spaceOne);
            }
            else if (( row>=10) &&( row <100) && (column >=10) && (column <100))
            {
                if (i < 1)
                {
                    System.out.print(spaceThree);
                }
                if (i < 9)
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if ((i >=9) &&(i <100))
                {
                    System.out.print((i+1) + spaceOne);
                }

            }
            else if (( row >= 100) && (column >=100))
            {
                if (i < 1)
                {
                    System.out.print(spaceFour);
                }
                if (i < 9)
                {
                    System.out.print((i+1) + spaceThree);
                }
                else if ((i >=9) &&(i <99))
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if (i >=99)
                {
                    System.out.print((i+1) + spaceOne);
                }
            }

            else if ((row < 10) && (column >=10 && column <100))
            {
                if (i < 1)
                {
                    System.out.print(spaceThree);
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceOne);
                }
            }
            else if ((row < 10) && (column >=100))
            {
                if (i < 1)
                {
                    System.out.print(spaceFour);
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceOne);
                }
            }

            else if ((column < 10) && (row >=10 && row <100))
            {
                if (i < 1)
                {
                    System.out.print(spaceThree); 
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if ((i >=9) &&(i <99))
                {
                    System.out.print((i+1) + spaceOne);
                }
            }
            else if  ((column < 10)&& (row >= 100))
            {
                if ( i < 1)
                {
                     System.out.print(spaceFour);
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceThree);
                }
                else if ((i >=9) &&(i <99))
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if (i >=99)
                {
                    System.out.print((i+1) + spaceOne);
                }
                
            }
            else if ((row >=100) && (column >= 10 && column <100))
            {
                if (i < 1)
                {
                    System.out.print(spaceFive);
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceThree);
                }
                else if ((i >=9) &&(i <99))
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if (i >=99)
                {
                    System.out.print((i+1) + spaceOne);
                }
            }
            else if ((column >=100) && (row >= 10 && row <100))
            {
                if (i < 1)
                {
                    System.out.print(spaceFive);
                }
                if (i <9)
                {
                    System.out.print((i+1) + spaceTwo);
                }
                else if (( i >=9) && (i <99))
                {
                    System.out.print((i+1) + spaceOne);
                }
            }
        }
        
        System.out.println("");
    }
    
    public static void setColumns()                                             //Good  // Reviewed
    {
        for(int i = 0; i < column; i++) // sets columns
        {
            if ((row < 10) && (column < 10))
            {
                System.out.print((i+1));
            }
            else if (( row>=10) &&( row <100) && (column >=10) && (column <100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceOne+ (i+1));
                }
                else if (( i>=9)&&(i <100))
                {
                    System.out.print((i+1));
                }
            }
            else if (( row >= 100) && (column >=100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceTwo+ (i+1));
                }
                else if (( i>=9)&&(i <99))
                {
                    System.out.print(spaceOne + (i+1));
                }
                else if ( i>=99)
                {
                    System.out.print((i+1));
                }
            }
            else if ((row < 10) && (column >=10 && column <100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceOne+ (i+1));
                }
                else if (( i>=9)&&(i <99))
                {
                    System.out.print((i+1));
                }
            }
            else if ((row < 10) && (column >=100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceTwo+ (i+1));
                }
                else if (( i>=9)&&(i <99))
                {
                    System.out.print(spaceOne + (i+1));
                }
                else if (i>=99)
                {
                    System.out.print((i+1));
                }
            }
            else if ((column < 10) && (row >=10 && row <100)) 
            {
                if ( i < 9)
                {
                    System.out.print((i+1));
                }
            }
            else if  ((column < 10)&& (row >= 100))
            {
                if ( i < 9)
                {
                    System.out.print((i+1));
                }
            }   
            else if ((row >=100) && (column >= 10 && column <100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceOne +(i+1));
                }
                else if (( i >=9) && (i <99))
                {
                    System.out.print((i+1));
                }
            }
            else if ((column >=100) && (row >= 10 && row <100))
            {
                if ( i < 9)
                {
                    System.out.print(spaceTwo +(i+1));
                }
                else if (( i >=9) && (i <99))
                {
                    System.out.print(spaceOne + (i+1));
                }
                else if ( i>= 99)
                {
                    System.out.print((i+1));
                }
            }
            for(int j = 0; j < row; j++)  //sets rows
            {
                if ((row <10) && (column <10))
                {
                    if (j<9)
                    {
                        if (j <1)
                        {
                            System.out.print(spaceOne);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x' + spaceOne);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceOne);
                        }
                    }
                }
                else if (( row>=10) &&( row <100) && (column >=10) && (column <100))
                {
                    if (j < 9)
                    {
                        if (j <1)
                        {
                            System.out.print(spaceOne);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceTwo);
                        }
                    }
                    else if (( j>=9) && (j <99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                          System.out.print(board[i][j].idIcon + spaceTwo);  
                        }
                    }
                }
                else if (( row >= 100) && (column >=100))
                {
                    if (j < 9)
                    {
                        if (j<1)
                        {
                            System.out.print(spaceOne);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                    else if ((j>=9) && (j<99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                          System.out.print(board[i][j].idIcon + spaceThree);  
                        }
                        
                    }
                    else if (j>=99)
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                           System.out.print(board[i][j].idIcon + spaceThree); 
                        }
                        
                    }
                }
                else if ((row < 10) && (column >=10 && column <100))
                {
                    if (j < 9)
                    {
                        if (j<1)
                        {
                            System.out.print(spaceOne);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceOne);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceOne);
                        }
                        
                    }
                }
                else if ((row < 10) && (column >=100))
                {
                    if (j < 9)
                    {
                        if (j<1)
                        {
                            System.out.print(spaceOne);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceOne);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceOne);
                        }
            
                    }
                }
                else if ((column < 10) && (row >=10 && row <100))
                {
                    if ( j <9)
                    {
                        if (j <1)
                        {
                            System.out.print(spaceTwo);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                           System.out.print(board[i][j].idIcon + spaceTwo); 
                        }
                        
                    }
                    else if ((j>=9) && (j<99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon +spaceTwo);
                        }
                        
                    }
                }
                else if ((column < 10)&& (row >= 100))
                {
                    if (j<9)
                    {
                        if (j<1)
                        {
                            System.out.print(spaceThree);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                    else if ((j>=9) && (j<99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                           System.out.print(board[i][j].idIcon + spaceThree); 
                        }
                        
                    }
                    else if (j>=99)
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                }
                else if ((row >=100) && (column >= 10 && column <100))
                {
                    if (j <9)
                    {
                        if (j<1)
                        {
                            System.out.print(spaceThree);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                    else if ((j>=9)&&(j<99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                    else if (j>= 99)
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceThree);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceThree);
                        }
                        
                    }
                }
                else if ((column >=100) && (row >= 10 && row <100))
                {
                    if (j < 9)
                    {
                        if (j <1)
                        {
                            System.out.print(spaceTwo);
                        }
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                           System.out.print(board[i][j].idIcon + spaceTwo); 
                        }
                     
                    }
                    else if ((j>=9)&&(j<99))
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceTwo);
                        }
                        
                    }
                    else if (j>=99)
                    {
                        if (board[i][j]==null)
                        {
                            System.out.print('x'+ spaceTwo);
                        }
                        else
                        {
                            System.out.print(board[i][j].idIcon + spaceTwo);
                        }
                        
                    }
                }
            }
            System.out.println("");
        }
    }
    
    
    
}
