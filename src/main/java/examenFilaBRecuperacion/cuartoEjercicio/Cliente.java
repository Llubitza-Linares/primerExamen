package examenFilaBRecuperacion.cuartoEjercicio;

public class Cliente {
    public static void main(String[] args) {

        Parrilla manu = new Parrilla();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();
        Bife bife = new Bife();

        System.out.println("***************");
        manu.setBuilder(bife);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();
        System.out.println("*******************");
        manu.setBuilder(tira);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();
        System.out.println("*********************");
        manu.setBuilder(lomito);
        manu.prepararPlato();
        manu.getPlato().mostrarInfo();

    }
}
