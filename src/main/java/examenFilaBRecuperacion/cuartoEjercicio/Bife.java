package examenFilaBRecuperacion.cuartoEjercicio;

public class Bife extends Builder{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Papas Fritas");
    }

}