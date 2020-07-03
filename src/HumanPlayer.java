import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanPlayer implements PlayerEngine {

    @Override
    public Move makeMove(Board board, Move[] moves) {
        if (moves.length == 0) {
            //TODO: end the game
        }
        System.out.println("Choose a move:");
        for (Move move : moves) {
            System.out.println(move.getMove());
        }
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i;
        outerLoop:
        while (true) {
            for (i = 0; i < moves.length; i++) {
                if (String.valueOf(in).equals(moves[i].getMove())) break outerLoop;
            }
        }
        return moves[i];
    }
}
