import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Prototype {
    private List<Piece> pieces;

    public ChessBoard() {
        this.pieces = new ArrayList<>();
        // Initialize the chess board with the standard setup
        initializeBoard();
    }

    // Initializes the pieces in their starting positions
    private void initializeBoard() {
        // Add black pieces
        pieces.add(new Piece(PieceType.ROOK, "black", 0, 0));
        pieces.add(new Piece(PieceType.KNIGHT, "black", 0, 1));
        pieces.add(new Piece(PieceType.BISHOP, "black", 0, 2));
        pieces.add(new Piece(PieceType.QUEEN, "black", 0, 3));
        pieces.add(new Piece(PieceType.KING, "black", 0, 4));
        pieces.add(new Piece(PieceType.BISHOP, "black", 0, 5));
        pieces.add(new Piece(PieceType.KNIGHT, "black", 0, 6));
        pieces.add(new Piece(PieceType.ROOK, "black", 0, 7));
        for (int i = 0; i < 8; i++) {
            pieces.add(new Piece(PieceType.PAWN, "black", 1, i));
        }

        // Add white pieces
        pieces.add(new Piece(PieceType.ROOK, "white", 7, 0));
        pieces.add(new Piece(PieceType.KNIGHT, "white", 7, 1));
        pieces.add(new Piece(PieceType.BISHOP, "white", 7, 2));
        pieces.add(new Piece(PieceType.QUEEN, "white", 7, 3));
        pieces.add(new Piece(PieceType.KING, "white", 7, 4));
        pieces.add(new Piece(PieceType.BISHOP, "white", 7, 5));
        pieces.add(new Piece(PieceType.KNIGHT, "white", 7, 6));
        pieces.add(new Piece(PieceType.ROOK, "white", 7, 7));
        for (int i = 0; i < 8; i++) {
            pieces.add(new Piece(PieceType.PAWN, "white", 6, i));
        }
    }

    // Return a list of all pieces on the board
    public List<Piece> getPieces() {
        return pieces;
    }

    // Clone the entire chess board
    @Override
    public ChessBoard cloneBoard() {
        ChessBoard clone = new ChessBoard();
        clone.pieces = new ArrayList<>();
        for (Piece piece : this.pieces) {
            clone.pieces.add(piece.clone());  // Clone each piece
        }
        return clone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Piece piece : pieces) {
            sb.append(piece.toString()).append("\n");
        }
        return sb.toString();
    }
}
