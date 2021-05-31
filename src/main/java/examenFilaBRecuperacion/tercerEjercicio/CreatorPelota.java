package examenFilaBRecuperacion.tercerEjercicio;

public class CreatorPelota extends Creator {

    @Override
    public Elemento create() {
        Pelota pelota = new Pelota();
        pelota.setColor("Negro");
        pelota.setGarantia("2 años");
        pelota.setTamano("Mediano");
        return pelota;
    }

}