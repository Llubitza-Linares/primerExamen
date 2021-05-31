package examenFilaBRecuperacion.quintoEjercicio;

public class Term1 extends AbsNumero{
    public Term1() {
    }

    @Override
    public void interpreter(ContextRomano context) {
        if (context.input.startsWith("IX")) {
            context.output=context.output+"9 ";
            context.input = context.input.substring(1);
        }

    }
}