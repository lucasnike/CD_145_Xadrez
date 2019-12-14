package chess;

import boardgame.Board;
import boardgame.Piece;
import exception.ChessException;

public class ChessPiece extends Piece{
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
		this.moveCount = 0;
	}
	
	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public ChessPosition getChessPosition() throws ChessException {
		return new ChessPosition(super.getPosition().getRow(), super.getPosition().getColumn());
	}
	
	protected void increaseMoveCount() {
		this.moveCount += 1;
	}
	protected void decreaseMoveCount() {
		this.moveCount -= 1;
	}
}
