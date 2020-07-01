public class Square {
    private char row;
    private char column;
    private Piece piece;

    public Square(char row, char col) {
        this.row = row;
        this.column = col;
    }

    public void addPiece(Piece piece) {
        if (this.piece == null) {
            this.piece = piece;
        } else {
            System.out.println("ALREADY A PIECE ON THIS SQUARE");
            this.piece = piece;
        }
    }

    public String toString() {
        return String.format("%s%s", row, column);
    }

    public String print() {
        //TODO: print piece or '.' if empty
        if (piece == null) {
            return String.valueOf('.');
        } else {
            return piece.print();
        }
    }
}
