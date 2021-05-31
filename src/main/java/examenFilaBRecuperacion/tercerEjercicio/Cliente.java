package examenFilaBRecuperacion.tercerEjercicio;

public class Cliente {
    public static void main(String[] args) {

        //CREANDO ELEMENTOS
        CreatorCamiseta camiseta = new CreatorCamiseta();
        camiseta.create().setColor("Amarillo");
        camiseta.create().setTamano("L");
        camiseta.create().crear();

        CreatorMedias medias = new CreatorMedias();
        medias.create().setColor("Blanco");
        medias.create().setTamano("M");
        medias.create().crear();

        CreatorPelota pelota = new CreatorPelota();
        pelota.create().crear();

        CreatorShorts shorts = new CreatorShorts();
        shorts.create().setColor("Negro");
        shorts.create().setTamano("L");
        shorts.create().crear();

        CreatorTenis tenis = new CreatorTenis();
        tenis.create().setGarantia("2 años");
        tenis.create().setTamano("40");
        tenis.create().setColor("Amarillo");
        tenis.create().crear();

        //CREANDO UNA CAMISA AMARILLA
        Camiseta camisa = (Camiseta) new CreatorCamiseta().create();
        camisa.setColor("amarillo");
        camisa.crear();
    }

}
