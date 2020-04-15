public class Board {
    private Console console;
    private Player[][] board;

    public Board(Console console) {
        this.console = console;
    }
    public void printBoard(){
        console.printBoard(
                board[0][0]+"|"+board[0][1]+"|" + board[0][2] + "/n"+
                board[1][0]+"|"+board[1][1]+"|" + board[1][2] + "/n"+
                board[2][0]+"|"+board[2][1]+"|" + board[2][2] + "/n"
        );
    }
}
