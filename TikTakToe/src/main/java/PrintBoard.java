public class PrintBoard {
    private Console console;

    public PrintBoard(Console console) {
        this.console = console;
    }


    public void printBoard(Board board) {
        console.printBoard(
                board.board[0][0] + "|" + board.board[0][1] + "|" + board.board[0][2] + "\n" +
                board.board[1][0] + "|" + board.board[1][1] + "|" + board.board[1][2] + "\n" +
                board.board[2][0] + "|" + board.board[2][1] + "|" + board.board[2][2]
        );
    }
}
