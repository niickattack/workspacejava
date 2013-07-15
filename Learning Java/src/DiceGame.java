// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
    	boolean heWon = false;
    	for (int i = 0; i < 4; i++)
    	{
    		int dieValue = generator.nextInt(6) + 1;
    		if (dieValue == 6)
    		{
    			heWon = true;
    		}
    	}
    	return heWon;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        boolean heWon = false;
        for (int i = 0; i < 24; i++)
        {
        	int firstRoll = generator.nextInt(6) + 1;
        	int secondRoll = generator.nextInt(6) + 1;
        	if (firstRoll == 6 && secondRoll == 6)
        	{
        		heWon = true;
        		
        	}
        }
        return heWon;
    }
}
