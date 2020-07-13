public class Square {
    private char row;
    private char column;
    private Piece piece;

    public Square(char col, char row) {
        this.row = row;
        this.column = col;
    }

    public void addPiece(Piece piece) {
        if (this.isEmpty()) {
            this.piece = piece;
        } else {
            System.out.println("ALREADY A PIECE ON THIS SQUARE");
            this.piece = piece;
        }
    }

    public String toString() {
        /*
          Returns the string of the square location e.g. e5
         */
        return String.format("%s%s", column, row);
    }

    public String print() {
        /*
          Returns the string of the piece in the square or '.' if empty
         */
        if (piece == null) {
            return String.valueOf('.');
        } else {
            return piece.print();
        }
    }

    public boolean isEmpty() {
        return this.piece == null;
    }

    public int getFile() {
        return (int) column - 97;
    }

    public int getRank() {
        return Integer.parseInt(String.valueOf(row))-1;
    }
}
