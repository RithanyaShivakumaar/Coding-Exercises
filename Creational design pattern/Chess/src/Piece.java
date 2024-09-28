public class Piece implements Cloneable {
    private PieceType type;
    private String color;  // Either "white" or "black"
    private int x;  // Row position on the board
    private int y;  // Column position on the board

    public Piece(PieceType type, String color, int x, int y) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public PieceType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Clone method to create a copy of the piece
    @Override
    public Piece clone() {
        try {
            return (Piece) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed");
        }
    }

    @Override
    public String toString() {
        return color + " " + type + " at (" + x + ", " + y + ")";
    }
}
