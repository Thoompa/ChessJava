public class Queen extends Piece {

    public Queen(PieceColour colour, String square) {
        super(colour, PieceType.QUEEN, square);
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
            return String.valueOf('Q');
        } else {
            return String.valueOf('q');
        }
    }
}
