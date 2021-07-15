public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		//System.out.println(square);
		if((square/8)%2==0)
		{
			if(square%2!=0)
				return true;
			else
				return false;
		}
		else
		{
			if(square%2==0)
				return true;
			else
				return false;
		}
	}
}
