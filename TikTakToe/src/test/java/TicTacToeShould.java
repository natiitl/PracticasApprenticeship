import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Exception.CellNotEmptyException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TicTacToeShould {
    Console console;
    PrintBoard printBoard;
    Game game;

    @BeforeEach
    public void init() {
        console = mock(Console.class);
        printBoard = new PrintBoard(console);
        game = new Game(printBoard);
    }

    @Test
    public void check_board_impression_when_playing_in_position_zero_zero() {
        game.putPosition(Position.POSITION00);
        verify(console).printBoard("x| | \n" + " | | \n" + " | | ");
    }

    @Test
    public void raise_error_when_cell_is_not_empty() {
        game.putPosition(Position.POSITION00);
        assertThrows(CellNotEmptyException.class, () -> game.putPosition(Position.POSITION00));
    }
    @Test
    public void  check_board_impression_when_playing_on_two_turns() {
        game.putPosition(Position.POSITION00);
        game.putPosition(Position.POSITION01);
        verify(console).printBoard("x| | \n" + " | | \n" + " | | ");
        verify(console).printBoard("x|o| \n" + " | | \n" + " | | ");
    }
}