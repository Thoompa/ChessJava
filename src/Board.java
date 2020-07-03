public class Board {
    Square[][] squares = new Square[8][8];
    PieceSet blackPieces;
    PieceSet whitePieces;

    public Board(){
        // Create squares
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                char row = (char)('a' + i);
                char col = (char)('1' + j);
                squares[i][j] = new Square(row, col);
            }
        }
        blackPieces = new PieceSet(PieceColour.BLACK);
        whitePieces = new PieceSet(PieceColour.WHITE);

        // Create pieces
        // Black pieces
        Rook blackARook = new Rook(PieceColour.BLACK);
        squares[0][7].addPiece(blackARook);  //a8
        Knight blackBKnight = new Knight(PieceColour.BLACK);
        squares[1][7].addPiece(blackBKnight);  //b8
        Bishop blackCBishop = new Bishop(PieceColour.BLACK);
        squares[2][7].addPiece(blackCBishop);  //c8
        Queen blackQueen = new Queen(PieceColour.BLACK);
        squares[3][7].addPiece(blackQueen);  //d8
        King blackKing = new King(PieceColour.BLACK);
        squares[4][7].addPiece(blackKing);  //e8
        Bishop blackFBishop = new Bishop(PieceColour.BLACK);
        squares[5][7].addPiece(blackFBishop);  //f8
        Knight blackGKnight = new Knight(PieceColour.BLACK);
        squares[6][7].addPiece(blackGKnight);  //g8
        Rook blackHRook = new Rook(PieceColour.BLACK);
        squares[7][7].addPiece(blackHRook);  //h8
        Pawn blackAPawn = new Pawn(PieceColour.BLACK);
        squares[0][6].addPiece(blackAPawn);  //a7
        Pawn blackBPawn = new Pawn(PieceColour.BLACK);
        squares[1][6].addPiece(blackBPawn);  //b7
        Pawn blackCPawn = new Pawn(PieceColour.BLACK);
        squares[2][6].addPiece(blackCPawn);  //c7
        Pawn blackDPawn = new Pawn(PieceColour.BLACK);
        squares[3][6].addPiece(blackDPawn);  //d7
        Pawn blackEPawn = new Pawn(PieceColour.BLACK);
        squares[4][6].addPiece(blackEPawn);  //e7
        Pawn blackFPawn = new Pawn(PieceColour.BLACK);
        squares[5][6].addPiece(blackFPawn);  //f7
        Pawn blackGPawn = new Pawn(PieceColour.BLACK);
        squares[6][6].addPiece(blackGPawn);  //g7
        Pawn blackHPawn = new Pawn(PieceColour.BLACK);
        squares[7][6].addPiece(blackHPawn);  //h7
        blackPieces.addPiece(blackARook);
        blackPieces.addPiece(blackBKnight);
        blackPieces.addPiece(blackCBishop);
        blackPieces.addPiece(blackQueen);
        blackPieces.addPiece(blackKing);
        blackPieces.addPiece(blackFBishop);
        blackPieces.addPiece(blackGKnight);
        blackPieces.addPiece(blackHRook);
        blackPieces.addPiece(blackAPawn);
        blackPieces.addPiece(blackBPawn);
        blackPieces.addPiece(blackCPawn);
        blackPieces.addPiece(blackDPawn);
        blackPieces.addPiece(blackEPawn);
        blackPieces.addPiece(blackFPawn);
        blackPieces.addPiece(blackGPawn);
        blackPieces.addPiece(blackHPawn);
        // White pieces
        Rook whiteARook = new Rook(PieceColour.WHITE);
        squares[0][0].addPiece(whiteARook);  //a1
        Knight whiteBKnight = new Knight(PieceColour.WHITE);
        squares[1][0].addPiece(whiteBKnight);  //b1
        Bishop whiteCBishop = new Bishop(PieceColour.WHITE);
        squares[2][0].addPiece(whiteCBishop);  //c1
        Queen whiteQueen = new Queen(PieceColour.WHITE);
        squares[3][0].addPiece(whiteQueen);  //d1
        King whiteKing = new King(PieceColour.WHITE);
        squares[4][0].addPiece(whiteKing);  //e1
        Bishop whiteFBishop = new Bishop(PieceColour.WHITE);
        squares[5][0].addPiece(whiteFBishop);  //f1
        Knight whiteGKnight = new Knight(PieceColour.WHITE);
        squares[6][0].addPiece(whiteGKnight);  //g1
        Rook whiteHRook = new Rook(PieceColour.WHITE);
        squares[7][0].addPiece(whiteHRook);  //h1
        Pawn whiteAPawn = new Pawn(PieceColour.WHITE);
        squares[0][1].addPiece(whiteAPawn);  //a2
        Pawn whiteBPawn = new Pawn(PieceColour.WHITE);
        squares[1][1].addPiece(whiteBPawn);  //b2
        Pawn whiteCPawn = new Pawn(PieceColour.WHITE);
        squares[2][1].addPiece(whiteCPawn);  //c2
        Pawn whiteDPawn = new Pawn(PieceColour.WHITE);
        squares[3][1].addPiece(whiteDPawn);  //d2
        Pawn whiteEPawn = new Pawn(PieceColour.WHITE);
        squares[4][1].addPiece(whiteEPawn);  //e2
        Pawn whiteFPawn = new Pawn(PieceColour.WHITE);
        squares[5][1].addPiece(whiteFPawn);  //f2
        Pawn whiteGPawn = new Pawn(PieceColour.WHITE);
        squares[6][1].addPiece(whiteGPawn);  //g2
        Pawn whiteHPawn = new Pawn(PieceColour.WHITE);
        squares[7][1].addPiece(whiteHPawn);  //h2
        whitePieces.addPiece(whiteARook);
        whitePieces.addPiece(whiteBKnight);
        whitePieces.addPiece(whiteCBishop);
        whitePieces.addPiece(whiteQueen);
        whitePieces.addPiece(whiteKing);
        whitePieces.addPiece(whiteFBishop);
        whitePieces.addPiece(whiteGKnight);
        whitePieces.addPiece(whiteHRook);
        whitePieces.addPiece(whiteAPawn);
        whitePieces.addPiece(whiteBPawn);
        whitePieces.addPiece(whiteCPawn);
        whitePieces.addPiece(whiteDPawn);
        whitePieces.addPiece(whiteEPawn);
        whitePieces.addPiece(whiteFPawn);
        whitePieces.addPiece(whiteGPawn);
        whitePieces.addPiece(whiteHPawn);
    }

    public void printBoard() {
        StringBuilder board = new StringBuilder();
        for (int j = 7; j >= 0; j--) {
            for (int i = 0; i <= 7; i++) {
                board.append(squares[i][j].print());
            }
            board.append('\n');
        }
        System.out.println(board);
    }

    public PieceSet getBlackPieces() {
        return blackPieces;
    }

    public PieceSet getWhitePieces() {
        return whitePieces;
    }
}
