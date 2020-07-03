public class Bishop extends Piece {

    public Bishop(PieceColour colour) {
        super(colour, PieceType.BISHOP);
    }

    @Override
    public Move[] validMoves(Board board) {
        return new Move[0];
    }

    @Override
    public Square[] attackSquares() {
        return new Square[0];
    }

    @Override
    public String print() {
        if (super.pieceColour == PieceColour.WHITE) {
            return String.valueOf('B');
        } else {
            return String.valueOf('b');
        }
    }
}
