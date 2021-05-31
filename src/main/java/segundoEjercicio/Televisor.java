package segundoEjercicio;

public class Televisor implements ITelevisor{

    private String sistemaOperativo;
    private String versionDelSO;
    private String pulgadas;
    private String resolucion;
    private String puertoHdmi;
    private String puertoUSB;
    private String controlRemoto;
    private String bluetooth;
    private String serialDelTelevisor;

   public String getSistemaOperativo() {
       return sistemaOperativo;
   }
   public void setSistemaOperativo(String sistemaOperativo){
       this.sistemaOperativo=sistemaOperativo;

   }

    public String getVersionDelSO() {
        return versionDelSO;
    }
    public void setVersionDelSO(String versionDelSO){
        this.versionDelSO=versionDelSO;

    }

    public String getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(String pulgadas){
        this.pulgadas=pulgadas;

    }

    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion){
        this.resolucion=resolucion;

    }

    public String getPuertoHdmi() {
        return puertoHdmi;
    }
    public void setPuertoHdmi(String puertoHdmi){
        this.puertoHdmi=puertoHdmi;

    }

    public String getPuertoUSB() {
        return puertoUSB;
    }
    public void setPuertoUSB(String puertoUSB){
        this.puertoUSB=puertoUSB;

    }

    public String getControlRemoto() {
        return controlRemoto;
    }
    public void setControlRemoto(String controlRemoto){
        this.controlRemoto=controlRemoto;

    }

    public String getBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(String bluetooth){
        this.bluetooth=bluetooth;

    }

    public String getSerialDelTelevisor() {
        return serialDelTelevisor;
    }
    public void setSerialDelTelevisor(String serialDelTelevisor){
        this.serialDelTelevisor=serialDelTelevisor;

    }



    @Override
    public Object clone() {

       Televisor objClone = new Televisor();
       objClone.setBluetooth(this.bluetooth);
        objClone.setControlRemoto(this.controlRemoto);
        objClone.setPuertoHdmi(this.puertoHdmi);
        objClone.setPulgadas(this.pulgadas);
        objClone.setResolucion(this.resolucion);
        objClone.setPuertoUSB(this.puertoUSB);
        objClone.setSerialDelTelevisor(this.serialDelTelevisor);
        objClone.setVersionDelSO(this.versionDelSO);
        objClone.setSistemaOperativo(this.sistemaOperativo);

        return objClone;
    }

    public void showInformation(){
       System.out.println("Sistema Operativo" +sistemaOperativo);
        System.out.println("Version del Sistema" + versionDelSO);
        System.out.println("Pulgadas" + pulgadas);
        System.out.println("Resolucion" + resolucion);
        System.out.println("PuertoHDMI" + puertoHdmi);
        System.out.println("PuertoUsb" + puertoUSB);
        System.out.println("Control Remoto" + controlRemoto);
        System.out.println("Bluetooth" +bluetooth);
        System.out.println("Serial del Televisor" + serialDelTelevisor);


    }

}
