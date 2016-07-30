package classWork.Chess;

public abstract class ChessMan {

    public static final int BLACK = 0;
    public static final int WHITE = 0;

    protected int row;
    protected int col;
    protected String status;

    public abstract void move();

}
