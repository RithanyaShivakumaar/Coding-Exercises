public class Main {
    public static void main(String[] args) {
        // Create the original chess board (prototype)
        ChessBoard originalBoard = new ChessBoard();
        System.out.println("Original Chess Board:");
        System.out.println(originalBoard);

        // Clone the chess board for a new game
        ChessBoard newGameBoard = originalBoard.cloneBoard();
        System.out.println("Cloned Chess Board for New Game:");
        System.out.println(newGameBoard);

        // Move some pieces on the new board (to demonstrate independence from original)
        newGameBoard.getPieces().get(0).setPosition(2, 0);  // Move black rook to (2,0)
        newGameBoard.getPieces().get(8).setPosition(4, 0);  // Move black pawn to (4,0)

        System.out.println("Modified Cloned Chess Board:");
        System.out.println(newGameBoard);

        System.out.println("Original Chess Board remains unchanged:");
        System.out.println(originalBoard);
    }
}
