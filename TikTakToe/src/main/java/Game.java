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

    }

    private boolean finalGame() {
        return false;
    }
}
