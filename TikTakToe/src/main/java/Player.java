public enum Player {
    PLAYER_X('x'),
    PLAYER_O('o'),
    NO_PLAYER(' ');

    public final char characterPlayer;

    Player(char characterPlayer) {

        this.characterPlayer = characterPlayer;
    }
}

