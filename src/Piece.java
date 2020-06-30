public abstract class Piece {
    private PieceColour pieceColour;
    private Square square;

    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
}
