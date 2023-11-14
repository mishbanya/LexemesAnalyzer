public class Lexeme {
    LexemeType type;
    /**
     * Если лексема число, то оно  записано здесь, если нет, то поле равно 0
     */
    int value;

    /**
     * Конструктор в случае числа
     * @param value число
     */
    public Lexeme(int value) {
        this.type = LexemeType.NUMBER;
        this.value = value;
    }

    /**
     * Конструктор, если лексема - не число
     * @param type тип лексемы
     */
    public Lexeme(LexemeType type) {
        this.type = type;
    }

    /**
     * @return обычный вывод string
     */
    @Override
    public String toString() {
        return "Лексема типа " + type + ", значение = " + value;
    }
}
