public class Game {
    private PieceColour turn;
    private Player[] players;
    private Board board;

    public Game() {
        board = new Board();
    }

    public void printBoard() {
        this.board.printBoard();
    }
}
