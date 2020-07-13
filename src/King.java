public class King extends Piece {

    public King(PieceColour colour, String square) {
        super(colour, PieceType.KING, square);
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
            return String.valueOf('K');
        } else {
            return String.valueOf('k');
        }
    }
}
