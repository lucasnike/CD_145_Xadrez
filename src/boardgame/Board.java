package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[this.rows][this.columns];
	}
		
}