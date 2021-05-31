package examenFilaBRecuperacion.tercerEjercicio;

public class Tenis implements Elemento {

    public String tamano;
    public String color;
    public String garantia;


    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public void crear() {
        System.out.println("Tamanio de tenis: " + tamano);
        System.out.println("Color de tenis: " + color);
        System.out.println("Garantia de tenis: " + garantia);
    }

}
