public class Board {
    public char[][] board = {
            {Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer},
            {Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer},
            {Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer,Player.NO_PLAYER.characterPlayer}};
    PrintBoard printBoard;

    public Board(PrintBoard printBoard) {
        this.printBoard = printBoard;
    }


    public boolean checkPosition(Position position) {
        if(board[position.row][position.column]==Player.NO_PLAYER.characterPlayer){
            return true;
        }
        return false;
    }

    public void addGame(Player player, Position position) {
        board[position.row][position.column] = player.characterPlayer;
    }
    public void print(){
        printBoard.printBoard(this);
    }
}

