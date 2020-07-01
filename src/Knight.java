public class Knight extends Piece {

    public Knight(PieceColour colour) {
        super(colour, PieceType.KNIGHT);
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
            return String.valueOf('N');
        } else {
            return String.valueOf('n');
        }
    }
}
