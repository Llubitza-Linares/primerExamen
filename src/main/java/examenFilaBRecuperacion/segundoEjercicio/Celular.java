package examenFilaBRecuperacion.segundoEjercicio;

public class Celular  implements ICelular{
    private String modelo;
    private String tamano;
    private String peso;
    private Camara camara;
    private String imei;
    private String origen;

    public Celular() {}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        Celular objClone= new Celular();
        objClone.setModelo(this.modelo);
        objClone.setTamano(this.tamano);
        objClone.setPeso(this.peso);
        objClone.setCamara(this.camara);
        objClone.setImei(this.imei);
        objClone.setOrigen(this.origen);

        return objClone;
    }

    public void showInformation() {
        System.out.println("*****************");
        System.out.println("modelo: "+ modelo);
        System.out.println("tamano: "+tamano);
        System.out.println("peso: "+peso);
        System.out.println("foco: "+camara.getFoco());
        System.out.println("lente: "+camara.getLente());
        System.out.println("imei: "+imei);
        System.out.println("origen: "+origen);
    }

}
