package examenFilaBRecuperacion.quintoEjercicio;

public class Cliente {
    public static void main(String[] args) {

        String romano="1 3";

        NonTerminal parcer = new NonTerminal(romano);
        String interpretado= parcer.interpretar();

        System.out.println("ROMANO:"+romano);
        System.out.println("ENTERO:" + interpretado);
    }
}
