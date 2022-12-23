package uttt;

import java.util.Scanner;

/*Bao Thinh Nguyen   CS2336.002
 * Analysis: Make Ultimate tic tac toe game using Object-oriented programming concepts. The game will consist of 9 small tic-tac-toe
 * boards arranged in a 3x3 big board. Game will have two players, can either be AI or player.
 * Design: The game will multiple object classes to represent everything from the board, game player to the moves made.
 * Class Move.java is implements Boardstate .
 * As the Board.java class is implements with Boardstate which tell us about the Boardstate and run on board class.
 * EveryException of Invalid move in the game is handle in Invalid Move Exception class similarliy MultipleMovesException and MoveNotexception classes works .
 * Abstract class Player is used to represent the player including human and AI. which can be extended by respective classes.
 * Move class will get the move made by the player and check if the location is available and on which board the move is made and decide which board is next for the
 * next player.
 * AI : The number of possible different matches is relatively small.
 * At the start, the first player can mark any of the 9 spaces. In the following turn the second player can mark one of the remaining 8 spaces and so on. 
 * The game continues until all the spaces are marked or one of the players win.
 * At each turn the algorithm evaluates all the possible consequences of each move (possible due to property 2) and chooses the one that will ensure a victory or a draw (possible due to property 1).
 * */
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static final int N_PLAYER_TYPES = 2;

	// Select two player types and start the game
	public static void main(String[] args) {
		Player player1 = selectPlayer("X");
		Player player2 = selectPlayer("O");
		
		Game game = new Game(player1, player2, new DisplaySpectator());
		System.out.println("=====Welcome to Ultimate Tic-Tac-Toe Game!!=====");
		game.play();
	}
	
	private static Player selectPlayer(String token) {
		System.out.print("Select a type of player to play " + 
				token + ", or press enter for a list of options: ");
		int type = 0;
		boolean error = true;
		while(error) {
			try {
				type = Integer.parseInt(scanner.nextLine());
				error = (type > N_PLAYER_TYPES) || (type <= 0);
			} catch (NumberFormatException e) {
				error = true;
			}
			if(error) {
				System.out.print("Please choose from the following options: \n"
						+ "1. Human-Controlled Player\n"
						+ "2. AI-Controlled Player\n"
						+ "\n"
						+ "Select an option: ");
			}
		}
		switch(type) {
		case 1:
			return new TerminalPlayer(token);
		case 2:
			return new AIPlayer(token, 100000, true);
		}
		return null; 
	}
}
