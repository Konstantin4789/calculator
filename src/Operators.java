public enum Operators {
    private final String actionCharacter;

    private Operator(String actionCharacter) {
        this.actionCharacter = actionCharacter;
    }
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EQUALS("=")
}
