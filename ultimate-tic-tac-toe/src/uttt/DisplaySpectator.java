package uttt;

public class DisplaySpectator {
	
	 public void gameStarted(BoardState board) {
		System.out.print(TerminalDisplay.displayBoard(board));
	}

	 public void moveMade(Move move) {

		System.out.print(TerminalDisplay.displayBoard(move));
	}

	 public void gameOver(BoardState board) {
		if(board.hasWinner()) {
			System.out.print("Player ");
			System.out.print(board.getWinner().getIdentifier());
			System.out.println(" wins!");
		} else {
			System.out.println("The game has ended in a tie");
		}
	}
}
