package primerEjercicio;

public class Vehiculo {
    String placa;
    String modelo;

    public String getPlaca (){
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void show(){
        System.out.println("Placa"+placa);
        System.out.println("Modelo"+ modelo);
    }
}
