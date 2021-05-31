package examenFilaBRecuperacion.cuartoEjercicio;

public class Tira extends Builder{

    @Override
    public void buildTipoCarne() {
        plato.setTipoCarne("Tira de Carne");
    }

    @Override
    public void buildSaborRefresco() {
        plato.setSaborRefresco("Coca cola");
    }

    @Override
    public void buildGuarniciones() {
        plato.setGuarniciones("Fideo");
    }
}
