package aplication;

import chess.ChessMatch;
import exception.ChessException;

public class Program {

	public static void main(String[] args) throws ChessException {
		ChessMatch match = new ChessMatch();
		
		UI.printBoard(match.getPieces());	
	}
}
