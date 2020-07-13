public class Board {
    private Square[][] squares = new Square[8][8];
    private PieceSet blackPieces;
    private PieceSet whitePieces;

    public Board(){
        // Create squares
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                char row = (char)('a' + i);
                char col = (char)('1' + j);
                squares[i][j] = new Square(row, col);
            }
        }

        // Initialise piece sets
        blackPieces = new PieceSet(PieceColour.BLACK);
        whitePieces = new PieceSet(PieceColour.WHITE);

        // Create pieces - make piece, add to a square, add to piece set
        // Black pieces
        Rook blackARook = new Rook(PieceColour.BLACK, "a8");
        squares[0][7].addPiece(blackARook);  //a8
        Knight blackBKnight = new Knight(PieceColour.BLACK, "b8");
        squares[1][7].addPiece(blackBKnight);  //b8
        Bishop blackCBishop = new Bishop(PieceColour.BLACK, "c8");
        squares[2][7].addPiece(blackCBishop);  //c8
        Queen blackQueen = new Queen(PieceColour.BLACK, "d8");
        squares[3][7].addPiece(blackQueen);  //d8
        King blackKing = new King(PieceColour.BLACK, "e8");
        squares[4][7].addPiece(blackKing);  //e8
        Bishop blackFBishop = new Bishop(PieceColour.BLACK, "f8");
        squares[5][7].addPiece(blackFBishop);  //f8
        Knight blackGKnight = new Knight(PieceColour.BLACK, "g8");
        squares[6][7].addPiece(blackGKnight);  //g8
        Rook blackHRook = new Rook(PieceColour.BLACK, "h8");
        squares[7][7].addPiece(blackHRook);  //h8
        Pawn blackAPawn = new Pawn(PieceColour.BLACK, "a7");
        squares[0][6].addPiece(blackAPawn);  //a7
        Pawn blackBPawn = new Pawn(PieceColour.BLACK, "b7");
        squares[1][6].addPiece(blackBPawn);  //b7
        Pawn blackCPawn = new Pawn(PieceColour.BLACK, "c7");
        squares[2][6].addPiece(blackCPawn);  //c7
        Pawn blackDPawn = new Pawn(PieceColour.BLACK, "d7");
        squares[3][6].addPiece(blackDPawn);  //d7
        Pawn blackEPawn = new Pawn(PieceColour.BLACK, "e7");
        squares[4][6].addPiece(blackEPawn);  //e7
        Pawn blackFPawn = new Pawn(PieceColour.BLACK, "f7");
        squares[5][6].addPiece(blackFPawn);  //f7
        Pawn blackGPawn = new Pawn(PieceColour.BLACK, "g7");
        squares[6][6].addPiece(blackGPawn);  //g7
        Pawn blackHPawn = new Pawn(PieceColour.BLACK, "h7");
        squares[7][6].addPiece(blackHPawn);  //h7
        blackPieces.addPiece(blackARook, squares[0][7]);
        blackPieces.addPiece(blackBKnight, squares[1][7]);
        blackPieces.addPiece(blackCBishop, squares[2][7]);
        blackPieces.addPiece(blackQueen, squares[3][7]);
        blackPieces.addPiece(blackKing, squares[4][7]);
        blackPieces.addPiece(blackFBishop, squares[5][7]);
        blackPieces.addPiece(blackGKnight, squares[6][7]);
        blackPieces.addPiece(blackHRook, squares[7][7]);
        blackPieces.addPiece(blackAPawn, squares[0][6]);
        blackPieces.addPiece(blackBPawn, squares[1][6]);
        blackPieces.addPiece(blackCPawn, squares[2][6]);
        blackPieces.addPiece(blackDPawn, squares[3][6]);
        blackPieces.addPiece(blackEPawn, squares[4][6]);
        blackPieces.addPiece(blackFPawn, squares[5][6]);
        blackPieces.addPiece(blackGPawn, squares[6][6]);
        blackPieces.addPiece(blackHPawn, squares[7][6]);
        // White pieces
        Rook whiteARook = new Rook(PieceColour.WHITE, "a1");
        squares[0][0].addPiece(whiteARook);  //a1
        Knight whiteBKnight = new Knight(PieceColour.WHITE, "b1");
        squares[1][0].addPiece(whiteBKnight);  //b1
        Bishop whiteCBishop = new Bishop(PieceColour.WHITE, "c1");
        squares[2][0].addPiece(whiteCBishop);  //c1
        Queen whiteQueen = new Queen(PieceColour.WHITE, "d1");
        squares[3][0].addPiece(whiteQueen);  //d1
        King whiteKing = new King(PieceColour.WHITE, "e1");
        squares[4][0].addPiece(whiteKing);  //e1
        Bishop whiteFBishop = new Bishop(PieceColour.WHITE, "f1");
        squares[5][0].addPiece(whiteFBishop);  //f1
        Knight whiteGKnight = new Knight(PieceColour.WHITE, "g1");
        squares[6][0].addPiece(whiteGKnight);  //g1
        Rook whiteHRook = new Rook(PieceColour.WHITE, "h1");
        squares[7][0].addPiece(whiteHRook);  //h1
        Pawn whiteAPawn = new Pawn(PieceColour.WHITE, "a2");
        squares[0][1].addPiece(whiteAPawn);  //a2
        Pawn whiteBPawn = new Pawn(PieceColour.WHITE, "b2");
        squares[1][1].addPiece(whiteBPawn);  //b2
        Pawn whiteCPawn = new Pawn(PieceColour.WHITE, "c2");
        squares[2][1].addPiece(whiteCPawn);  //c2
        Pawn whiteDPawn = new Pawn(PieceColour.WHITE, "d2");
        squares[3][1].addPiece(whiteDPawn);  //d2
        Pawn whiteEPawn = new Pawn(PieceColour.WHITE, "e2");
        squares[4][1].addPiece(whiteEPawn);  //e2
        Pawn whiteFPawn = new Pawn(PieceColour.WHITE, "f2");
        squares[5][1].addPiece(whiteFPawn);  //f2
        Pawn whiteGPawn = new Pawn(PieceColour.WHITE, "g2");
        squares[6][1].addPiece(whiteGPawn);  //g2
        Pawn whiteHPawn = new Pawn(PieceColour.WHITE, "h2");
        squares[7][1].addPiece(whiteHPawn);  //h2
        whitePieces.addPiece(whiteARook, squares[0][0]);
        whitePieces.addPiece(whiteBKnight, squares[1][0]);
        whitePieces.addPiece(whiteCBishop, squares[2][0]);
        whitePieces.addPiece(whiteQueen, squares[3][0]);
        whitePieces.addPiece(whiteKing, squares[4][0]);
        whitePieces.addPiece(whiteFBishop, squares[5][0]);
        whitePieces.addPiece(whiteGKnight, squares[6][0]);
        whitePieces.addPiece(whiteHRook, squares[7][0]);
        whitePieces.addPiece(whiteAPawn, squares[0][1]);
        whitePieces.addPiece(whiteBPawn, squares[1][1]);
        whitePieces.addPiece(whiteCPawn, squares[2][1]);
        whitePieces.addPiece(whiteDPawn, squares[3][1]);
        whitePieces.addPiece(whiteEPawn, squares[4][1]);
        whitePieces.addPiece(whiteFPawn, squares[5][1]);
        whitePieces.addPiece(whiteGPawn, squares[6][1]);
        whitePieces.addPiece(whiteHPawn, squares[7][1]);
    }

    public void printBoard() {
        StringBuilder board = new StringBuilder();
        board.append("--ABCDEFGH-\n");
        board.append("-----------\n");
        for (int j = 7; j >= 0; j--) {
            board.append((j + 1)).append('-');
            for (int i = 0; i <= 7; i++) {
                board.append(squares[i][j].print());
            }
            board.append("-\n");
        }
        board.append("-----------\n");
        System.out.println(board);
    }

    public PieceSet getBlackPieces() {
        return blackPieces;
    }

    public PieceSet getWhitePieces() {
        return whitePieces;
    }

    public Square[][] getSquares() {
        return squares;
    }
}
