package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] mass = new ChessPiece[]{
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece pawn : mass) {
            System.out.print(pawn.getFigure() + " ");
        }
    }
}