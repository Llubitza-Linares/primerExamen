package examenFilaBRecuperacion.tercerEjercicio;

public class CreatorCamiseta extends Creator {
    @Override
    public Elemento create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Rojo");
        camiseta.setGarantia("1 ańo");
        camiseta.setTamano("L");
        return camiseta;
    }
}
