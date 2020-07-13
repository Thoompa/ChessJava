import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class PieceSet {
    private ArrayList<Piece> pieceSet;
    private ArrayList<Square> squares;
    private final PieceColour colour;

    public PieceSet(PieceColour colour) {
        this.colour = colour;
        pieceSet = new ArrayList<>();
        squares = new ArrayList<>();
    }

    public void addPiece(Piece piece, Square square) {
        squares.add(square);
        pieceSet.add(piece);
    }

    public PieceColour getColour() {
        return colour;
    }

    public ArrayList<Piece> getPieceSet() {
        return pieceSet;
    } // This will need to be fixed

    public Move[] getMoves(Board board) {
        Move[] moves = new Move[0];
        for (Piece piece : pieceSet) {
            Move[] newMoves = piece.validMoves(board);
            if (newMoves.length != 0) {
                moves = Arrays.copyOf(moves, moves.length + newMoves.length);
                System.arraycopy(newMoves, 0, moves, moves.length - newMoves.length, newMoves.length);
            }
        }
        return moves;
    }

    public ArrayList<Square> getSquares() {
        return squares;
    } // This will need to be fixed
}
