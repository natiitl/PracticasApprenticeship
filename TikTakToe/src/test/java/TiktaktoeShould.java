import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;



public class TiktaktoeShould {
    Console console;
    Board board;

    @BeforeEach
    public void init(){
        console = mock(Console.class);
        board = new Board(console);
    }
/*
    @Test
    public void test(){
        board.printBoard();
        verify(console).printBoard(" | | ");
    }
*/
}
