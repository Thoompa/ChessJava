public class Queen extends Piece {

    public Queen(PieceColour colour) {
        super(colour, PieceType.QUEEN);
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
            return String.valueOf('Q');
        } else {
            return String.valueOf('q');
        }
    }
}
