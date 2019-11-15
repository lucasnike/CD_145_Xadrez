package boardgame;

import exception.*;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		super();
		if (this.rows < 0 || this.columns < 0) {
			throw new BoardException("The Board need more than one line or columns");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[this.rows][this.columns];
		
	}
	
	public Board(Position position) {
		if (this.rows < 0 || this.columns < 0) {
			throw new BoardException("The Board need more than one line or columns");
		}
		this.rows = position.getRow();
		this.columns = position.getColumn();
		this.pieces = new Piece[this.rows][this.columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
		
	public Piece piece(int row, int column) {
		if (!positionExist(row, column)) {
			throw new BoardException("The position does not exist");
		}
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("The position does not exist");
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Already there was a piece on this position - " + position);
		}
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	public void removePiece(Position position) {
		if (!thereIsAPiece(position)) {
			throw new BoardException("There was no piece in this position - " + position);
		}
		this.pieces[position.getRow()][position.getColumn()] = null;
	}
	private boolean positionExist(int row, int column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}
	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getColumn());
	}
	public boolean thereIsAPiece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("The position does not exist");
		}
		return piece(position) != null;
	}
}
