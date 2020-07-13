import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends Piece {

    public Pawn(PieceColour colour, String square) {
        super(colour, PieceType.PAWN, square);
    }

    @Override
    public Move[] validMoves(Board board) {
        Move[] moves = new Move[0];
        if (super.pieceColour == PieceColour.WHITE) {
            ArrayList<Square> pieceSquares = board.getWhitePieces().getSquares();
            for (Square pieceSquare : pieceSquares) {
                if (pieceSquare.toString().equals(super.square)) {
                    Square newSquare = board.getSquares()[pieceSquare.getFile()][pieceSquare.getRank() + 1];
                    moves = Arrays.copyOf(moves, moves.length + 1);
                    moves[moves.length - 1] = new Move(pieceSquare, newSquare, this);
//                    if (mySquare.getRank() == 1) {
//                        if
//                    }
                }
            }
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
