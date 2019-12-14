package chess;

import exception.ChessException;
import boardgame.*;

public class ChessPosition {
	private int row;
	private int column;
	public ChessPosition(int row, int column) throws ChessException {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Valores válidos são de a1 até h8");
		}
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected ChessPosition fromPosition(Position p ) throws ChessException {
		return new ChessPosition((char)('a') - (p.getColumn()), 8 - p.getRow());
	}
	@Override
	public String toString() {
		return "" + column + row;
	}
}
