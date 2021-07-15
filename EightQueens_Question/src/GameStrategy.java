public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		for(int i=0;i<8;i++)
		{
			if(placedQueens[row][i]==true)
				return false;
		}
		for(int j=0;j<8;j++)
		{	if(placedQueens[j][col]==true)
				return false;
		}
		for (int i = row, j = col; i>=0 && j>=0; i--, j--)
		{   if (placedQueens[i][j] == true)
                return false;
		}
		for (int i = row, j = col; i>=0 && j<8 ; i--, j++)
		{ if (placedQueens[i][j] == true)
                return false;
		}
		for (int i = row, j = col; i<8 && j<8; i++, j++)
		{   if (placedQueens[i][j] == true)
                return false;
		}
        for (int i = row, j = col; j>=0 && i<8; i++, j--)
        {   if (placedQueens[i][j] == true)
               return false;
        }
        numQueens++;
        placedQueens[row][col]=true;
		return isValid;
	}
}














