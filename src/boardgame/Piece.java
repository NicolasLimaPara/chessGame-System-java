package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //o java ja coloca nulo por padrão (nao precisa colocar returnar esse nulo)
	}
	
	protected Board getBoard() {
		return board;
	}
	
		
	
}
