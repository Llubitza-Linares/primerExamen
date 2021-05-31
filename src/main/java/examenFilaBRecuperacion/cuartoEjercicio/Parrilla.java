package examenFilaBRecuperacion.cuartoEjercicio;

public class Parrilla {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Plato getPlato(){
        return builder.getPlato();
    }

    public void prepararPlato(){
        this.builder.createPlato();
        this.builder.buildGuarniciones();
        this.builder.buildTipoCarne();
        this.builder.buildSaborRefresco();
    }
}
