public class Driver {

    public static void main(String[] args){
        Game game = new Game();  // Initialise game
        game.printBoard();  // Print the board
        // Set up players
        Player white = new Player("White");
        Player black = new Player("Black");
        white.addEngine(new HumanPlayer());
        black.addEngine(new HumanPlayer());
        white.setColour(PieceColour.WHITE);
        black.setColour(PieceColour.BLACK);
        game.addPlayers(white, black);

        while (!(game.hasEnded())) {
            game.makeMove();
        }
    }
}
