public class Game {
    private PieceColour turn;
    private Player white;
    private Player black;
    private Board board;
    private boolean hasEnded;

    public Game() {
        board = new Board();  // Initialise board
        turn = PieceColour.WHITE;
        hasEnded = false;
    }

    public void printBoard() {
        this.board.printBoard();
    }

    public void addPlayers(Player white, Player black) {
        if (white.getColour() == PieceColour.WHITE && black.getColour() == PieceColour.BLACK) {
            this.white = white;
            this.black = black;
        } else {
            System.out.println("ERROR: Wrong colours");
        }
    }

    public void makeMove() {
        Move nextMove;
        if (turn == PieceColour.WHITE) {
            nextMove = white.makeMove(board);
        } else {
            nextMove = black.makeMove(board);
        }
        nextMove.execute();
        System.out.println(nextMove.getString());
        hasEnded = true;
    }

    public boolean hasEnded() {
        return hasEnded;
    }
}
