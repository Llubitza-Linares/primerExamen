package examenFilaBRecuperacion.tercerEjercicio;

public class CreatorShorts extends Creator {
    @Override
    public Elemento create() {
        Shorts shorts = new Shorts();
        shorts.setColor("Azul");
        shorts.setGarantia("1 ańo");
        shorts.setTamano("38");
        return shorts;
    }
}
