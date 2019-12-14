package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;
import exception.ChessException;

public class ChessMatch {
	private Board board;

	public ChessMatch() throws ChessException{
		super();
		this.board = new Board(8, 8);
		initialSetUp();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getRows(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece p) throws ChessException {
		board.placePiece(p, new ChessPosition(row, column).toPosition());
	}
	
	private void initialSetUp() throws ChessException {
		placeNewPiece('a', 8,new Rook(this.board, Color.BLACK));
		placeNewPiece('h', 8,new Rook(this.board, Color.BLACK));
		placeNewPiece('a', 1,new Rook(this.board, Color.WHITE));
		placeNewPiece('h', 1,new Rook(this.board, Color.WHITE));
		placeNewPiece('d', 1,new King(this.board, Color.WHITE));
		placeNewPiece('d', 8,new King(this.board, Color.BLACK));
		for (int i = 0; i < 8; i++) {
			this.board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, i));
			this.board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, i));
		}
		placeNewPiece('e', 1,new Queen(this.board, Color.WHITE));
		placeNewPiece('e', 8,new Queen(this.board, Color.BLACK));
		
		placeNewPiece('c', 1,new Bishop(this.board, Color.WHITE));
		placeNewPiece('c', 8,new Bishop(this.board, Color.BLACK));
		placeNewPiece('f', 1,new Bishop(this.board, Color.WHITE));
		placeNewPiece('f', 8,new Bishop(this.board, Color.BLACK));
		
		placeNewPiece('b', 1,new Knight(this.board, Color.WHITE));
		placeNewPiece('b', 8,new Knight(this.board, Color.BLACK));
		placeNewPiece('g', 1,new Knight(this.board, Color.WHITE));
		placeNewPiece('g', 8,new Knight(this.board, Color.BLACK));

	}
}
