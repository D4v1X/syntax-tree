package evaluator.symbols;

public class Symbol{
    private Precedencia precedencia;

    public Symbol(Precedencia precedencia) {
        this.precedencia = precedencia;
    }

    public Precedencia getPrecedencia() {
        return precedencia;
    }
}
