package examenFilaBRecuperacion.cuartoEjercicio;

public class Lomito extends Builder{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Arroz");
    }

}