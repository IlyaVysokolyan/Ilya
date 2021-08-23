package day17;


public class ChessBoard {
    ChessPiece [][] board ;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    void print(){
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j].getFigure());
            }
            System.out.println();
        }
    }
}
