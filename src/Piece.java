public abstract class Piece {
    protected PieceColour pieceColour;
    protected PieceType type;
    protected String square;

    public Piece(PieceColour colour, PieceType type, String square) {
        this.pieceColour = colour;
        this.type = type;
        this.square = square;
    }

    public abstract Move[] validMoves(Board board);
    public abstract Square[] attackSquares();
    public abstract String print();
}
