package examenFilaBRecuperacion.quintoEjercicio;

public class Term9 extends AbsNumero{
    public Term9() {
    }

    @Override
    public void interpreter(ContextRomano context) {
        if (context.input.startsWith("IX")) {
            context.output=context.output+"9 ";
            context.input = context.input.substring(1);
        }

    }
}