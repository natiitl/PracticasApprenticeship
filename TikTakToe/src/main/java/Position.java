public enum Position {

    POSITION00(0, 0),
    POSITION01(0, 1),
    POSITION02(0, 2),
    POSITION10(1, 0),
    POSITION11(1, 1),
    POSITION12(1, 2),
    POSITION20(2, 0),
    POSITION21(2, 1),
    POSITION22(2, 2);
    public final int row, column;

    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

