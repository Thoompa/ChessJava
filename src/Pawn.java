public class Pawn extends Piece {

    public Pawn(PieceColour colour) {
        super(colour, PieceType.PAWN);
    }

    @Override
    public Move[] validMoves(Board board) {
        Move[] moves = new Move[0];
        if (super.pieceColour == PieceColour.WHITE) {
            //TODO
        }
        return moves;
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
