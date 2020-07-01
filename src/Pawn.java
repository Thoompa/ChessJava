public class Pawn extends Piece {

    public Pawn(PieceColour colour) {
        super(colour, PieceType.PAWN);
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
            return String.valueOf('P');
        } else {
            return String.valueOf('p');
        }
    }
}
