package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch(){
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
	private void initialSetUp() {
		this.board.placePiece(new Rook(this.board, Color.WHITE), new Position(0, 0));
		this.board.placePiece(new Rook(this.board, Color.WHITE), new Position(0, 7));
		this.board.placePiece(new Rook(this.board, Color.BLACK), new Position(7, 0));
		this.board.placePiece(new Rook(this.board, Color.BLACK), new Position(7, 7));
		this.board.placePiece(new King(this.board, Color.WHITE), new Position(0, 4));
		this.board.placePiece(new King(this.board, Color.BLACK), new Position(7, 4));
		for (int i = 0; i < 8; i++) {
			this.board.placePiece(new Pawn(this.board, Color.WHITE), new Position(1, i));
			this.board.placePiece(new Pawn(this.board, Color.BLACK), new Position(6, i));
		}
		this.board.placePiece(new Queen(this.board, Color.WHITE), new Position(0, 3));
		this.board.placePiece(new Queen(this.board, Color.BLACK), new Position(7, 3));
		
		this.board.placePiece(new Bishop(this.board, Color.WHITE), new Position(0, 2));
		this.board.placePiece(new Bishop(this.board, Color.BLACK), new Position(7, 2));
		this.board.placePiece(new Bishop(this.board, Color.WHITE), new Position(0, 5));
		this.board.placePiece(new Bishop(this.board, Color.BLACK), new Position(7, 5));
		
		this.board.placePiece(new Knight(this.board, Color.WHITE), new Position(0, 1));
		this.board.placePiece(new Knight(this.board, Color.BLACK), new Position(7, 6));
		this.board.placePiece(new Knight(this.board, Color.WHITE), new Position(0, 6));
		this.board.placePiece(new Knight(this.board, Color.BLACK), new Position(7, 1));
	}
}
