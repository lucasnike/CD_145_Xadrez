package aplication;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < 8; i++) {
			System.out.print((8 - i) + " ");

			for (int j = 0; j < 8; j++) {
				printPiece(pieces[i][j]);	
			}
			System.out.println();
		}
		System.out.print("  ");
		for (char i = 'a'; i <= 'h'; i++) {
			System.out.print(i + " ");
		}
	}
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("- ");
		}else {
			System.out.print(piece.toString() + " ");
		}
	}
}
