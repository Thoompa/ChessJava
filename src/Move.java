public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;
    private String move;

    public Move(Square startSquare, Square endSquare, Piece piece) {
        this.startSquare = startSquare;
        this.endSquare = endSquare;
        this.piece = piece;
        move = piece.print() + ',' + startSquare.toString() + ',' + endSquare.toString();
    }

    public Square getStartSquare() {
        return startSquare;
    }

    public Square getEndSquareSquare() {
        return endSquare;
    }

    public Piece getPiece() {
        return piece;
    }

    public String getString() {
        return move;
    }

    public void execute() {
        // TODO
    }
}
