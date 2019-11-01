package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public Position getPosition() {
		return position;
	}
	
}
