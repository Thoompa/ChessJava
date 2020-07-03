public class Player {
    private PieceColour colour;
    private PlayerEngine engine;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void addEngine(PlayerEngine engine) {
        this.engine = engine;
    }

    public void setColour(PieceColour colour) {
        this.colour = colour;
    }

    public PieceColour getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public Move makeMove(Board board) {
        PieceSet pieces;
        if (colour == PieceColour.BLACK) {
            pieces = board.getBlackPieces();
        } else {
            pieces = board.getWhitePieces();
        }
        Move[] Moves = pieces.getMoves(board);
        return engine.makeMove(board, Moves);
    }
}
