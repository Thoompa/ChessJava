public abstract class Piece {
    protected PieceColour pieceColour;
    protected PieceType type;

    public Piece(PieceColour colour, PieceType type) {
        this.pieceColour = colour;
        this.type = type;
    }

    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract String print();
}
