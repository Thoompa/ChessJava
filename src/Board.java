public class Board {
    Square[][] squares = new Square[8][8];
    PieceSet[] pieces;

    public Board(){
        // Create squares
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                char row = (char)('a' + i);
                char col = (char)('1' + j);
                squares[i][j] = new Square(row, col);
            }
        }

        // Create pieces
        King blackKing = new King(PieceColour.BLACK);
        squares[0][0].addPiece(blackKing);
    }

    public void printBoard() {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                board.append(squares[i][j].print());
            }
            board.append('\n');
        }
        System.out.println(board);
    }
}
