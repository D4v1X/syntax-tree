package evaluator.symbols;

public class Precedencia {
    public static final Precedencia funtion = new Precedencia(4);
    public static final Precedencia empowerment = new Precedencia(3);
    public static final Precedencia roots = new Precedencia(3);
    public static final Precedencia multiplication = new Precedencia(2);
    public static final Precedencia division = new Precedencia(2);
    public static final Precedencia sum = new Precedencia(1);
    public static final Precedencia subtraction = new Precedencia(1);
    private final Integer value;

    public Precedencia(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
