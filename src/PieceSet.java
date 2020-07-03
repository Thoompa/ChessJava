import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class PieceSet {
    ArrayList<Piece> pieceSet;
    PieceColour colour;

    public PieceSet(PieceColour colour) {
        this.colour = colour;
        pieceSet = new ArrayList<>();
    }

    public void addPiece(Piece piece) {
        pieceSet.add(piece);
    }

    public Move[] getMoves(Board board) {
        Move[] Moves = new Move[0];
        for (Piece piece : pieceSet) {
            Move[] newMoves = piece.validMoves(board);
            if (newMoves.length != 0) {
                Moves = Arrays.copyOf(Moves, Moves.length + newMoves.length);
                for (int j = Moves.length; j <= Moves.length + newMoves.length; j++) {
                    System.out.println(Moves.length + valueOf(j));
                    Moves[j] = newMoves[j - Moves.length];
                }
            }
        }
        return Moves;
    }
}
