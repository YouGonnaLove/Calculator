class Number {

    private int value;
    private NumType type;

    Number(int value, NumType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    NumType getType() {
        return type;
    }
}
