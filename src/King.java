public class King extends Piece {

    public King(PieceColour colour) {
        super(colour, PieceType.KING);
    }

    @Override
    public Square[] validMoves() {
        return new Square[0];
    }

    @Override
    public Square[] attackSquares() {
        return new Square[0];
    }

    @Override
    public String print() {
        if (super.pieceColour == PieceColour.WHITE) {
            return String.valueOf('K');
        } else {
            return String.valueOf('k');
        }
    }
}
