package examenFilaBRecuperacion.tercerEjercicio;
public class CreatorTenis extends Creator {
    @Override
    public Elemento create() {
        Tenis tenis = new Tenis();
        tenis.setColor("Morado");
        tenis.setGarantia("4 años");
        tenis.setTamano("41");
        return tenis;
    }
}