import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;



public class TiktaktoeShould {
    Console console;
    PrintBoard printBoard;
    Game game;

    @BeforeEach
    public void init(){
        console = mock(Console.class);
        printBoard = new PrintBoard(console);
        game = new Game(printBoard);
    }
    @Test
    public void check_board_impression_when_playing_in_position_zero_zero(){
     game.putPosition(Position.POSITION00);
     verify(console).printBoard("x| | \n" +" | | \n" + " | | ");
    }

}
