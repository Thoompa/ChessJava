public class Rook extends Piece {

    public Rook(PieceColour colour) {
        super(colour, PieceType.ROOK);
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
            return String.valueOf('R');
        } else {
            return String.valueOf('r');
        }
    }
}