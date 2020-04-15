import Exception.CellNotEmptyException;
public class Game {
    private Board board;
    Player lastPlayer = Player.PLAYER_X;

    private PrintBoard printBoard;

    public Game(PrintBoard printBoard) {

        this.printBoard = printBoard;
        this.board = new Board(printBoard);

    }

    public void putPosition(Position position) {
        if(!board.checkPosition(position)){
            throw new CellNotEmptyException("The cell is not empty, play again");
        }
       // while(finalGame()){
            board.addGame(lastPlayer,position);
            board.print();
           // putPosition(position);
       // }
        if(lastPlayer == Player.PLAYER_X) lastPlayer = Player.PLAYER_O;
        else if(lastPlayer == Player.PLAYER_O) lastPlayer = Player.PLAYER_X;

    }

    private boolean finalGame() {
        return false;
    }
}
